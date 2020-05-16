package com.example.rest.service;

import com.example.rest.dto.PessoaDTO;
import com.example.rest.dto.mapper.DozerConversor;
import com.example.rest.entity.Pessoa;
import com.example.rest.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import java.util.*;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository repository;

    public PessoaDTO criar(PessoaDTO pessoa) {
        var entity = DozerConversor.parseObject(pessoa,Pessoa.class);
        var dto = DozerConversor.parseObject(repository.save(entity),PessoaDTO.class);
        return dto;
    }

    public List<PessoaDTO> listarTodos(){
        return DozerConversor.parseListObjects(repository.findAll(),PessoaDTO.class);
    }

    public PessoaDTO atualizar(PessoaDTO pessoa) {
        Pessoa entity = repository.findById(pessoa.getId())
                .orElseThrow(() -> new ResourceAccessException("não encontramos nenhum registro para esse ID"));

        entity.setPrimeiroNome(pessoa.getPrimeiroNome());
        entity.setUltimoNome(pessoa.getUltimoNome());
        entity.setEndereco(pessoa.getEndereco());
        entity.setGenero(pessoa.getGenero());

        var dto = DozerConversor.parseObject(repository.save(entity),PessoaDTO.class);
        return dto;
    }

    public PessoaDTO procurarPorId(Long id){
        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceAccessException("não encontramos nenhum registro para esse ID"));
        return DozerConversor.parseObject(entity,PessoaDTO.class);
    }

    public void deletar(Long id) {
        Pessoa entity = repository.findById(id)
                .orElseThrow(() -> new ResourceAccessException("não encontramos nenhum registro para esse ID"));

        repository.delete(entity);
    }
}
