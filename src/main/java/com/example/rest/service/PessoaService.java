package com.example.rest.service;

import com.example.rest.model.Pessoa;
import com.example.rest.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import java.util.*;

@Service
public class PessoaService {


    @Autowired
    PessoaRepository repository;

    public Pessoa criar(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public Pessoa atualizar(Pessoa pessoa) {
        Pessoa entity = repository.findById(pessoa.getId())
                .orElseThrow(() -> new ResourceAccessException("não encontramos nenhum registro para esse ID"));

        entity.setPrimeiroNome(pessoa.getPrimeiroNome());
        entity.setUltimoNome(pessoa.getUltimoNome());
        entity.setEndereco(pessoa.getEndereco());
        entity.setGenero(pessoa.getGenero());
        return repository.save(entity);
    }

    public Pessoa procurarPorId(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new ResourceAccessException("não encontramos nenhum registro para esse ID"));
    }

    public List<Pessoa> listarTodos(){
        return repository.findAll();
    }

    public void deletar(Long id) {
        Pessoa entity = repository.findById(id)
                .orElseThrow(() -> new ResourceAccessException("não encontramos nenhum registro para esse ID"));

        repository.delete(entity);
    }
}
