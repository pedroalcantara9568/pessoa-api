package com.example.rest.dto.mapper.mocks;

import com.example.rest.dto.PessoaDTO;
import com.example.rest.entity.Pessoa;
import java.util.*;

public class MockPessoa {

    public Pessoa mockEntity(){
        return mockEntity(0);
    }
    public PessoaDTO mockDTO(){
        return mockDTO(0);
    }
    public List<Pessoa> mockEntityList(){
        List<Pessoa> pessoas = new ArrayList<>();
        for(int i = 0; i < 14 ; i++){
            pessoas.add(mockEntity(i));
        }
        return pessoas;
    }

    public List<PessoaDTO> mockDTOList(){
        List<PessoaDTO> pessoas = new ArrayList<>();
        for(int i = 0; i < 14 ; i++){
            pessoas.add(mockDTO(i));
        }
        return pessoas;
    }

    private Pessoa mockEntity(Integer numero) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(numero.longValue());
        pessoa.setPrimeiroNome("Pedro" + numero);
        pessoa.setUltimoNome("Alcântara");
        pessoa.setEndereco("Endereco" + numero);
        pessoa.setGenero("Genero" + numero);
        return pessoa;
    }

    private PessoaDTO mockDTO(Integer numero) {
        PessoaDTO pessoa = new PessoaDTO();
        pessoa.setId(numero.longValue());
        pessoa.setPrimeiroNome("Pedro" + numero);
        pessoa.setUltimoNome("Alcântara"+numero);
        pessoa.setEndereco("Endereco" + numero);
        pessoa.setGenero("Genero" + numero);
        return pessoa;
    }


}
