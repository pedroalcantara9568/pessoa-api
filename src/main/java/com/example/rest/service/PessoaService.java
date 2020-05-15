package com.example.rest.service;

import com.example.rest.model.Pessoa;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class PessoaService {

    private final AtomicLong counter = new AtomicLong();

    public Pessoa findById(String id){
        Pessoa pessoa = new Pessoa();
        pessoa.setId(counter.incrementAndGet());
        pessoa.setPrimeiroNome("Pedro");
        pessoa.setUltimoNome("Alcântara");
        pessoa.setEndereco("Maceió - Alagoas - Brazil");
        pessoa.setGenero("Masculino");
        return pessoa;
    }
}
