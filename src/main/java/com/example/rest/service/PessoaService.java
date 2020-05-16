package com.example.rest.service;

import com.example.rest.model.Pessoa;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PessoaService {

    private final AtomicLong counter = new AtomicLong();

    public Pessoa criar(Pessoa pessoa) {
        return pessoa;
    }

    public Pessoa atualizar(Pessoa pessoa) {

        return pessoa;
    }

    public Pessoa procurarPorId(String id){
        Pessoa pessoa = new Pessoa();
        pessoa.setId(counter.incrementAndGet());
        pessoa.setPrimeiroNome("Pedro");
        pessoa.setUltimoNome("Alcântara");
        pessoa.setEndereco("Maceió - Alagoas - Brazil");
        pessoa.setGenero("Masculino");
        return pessoa;
    }

    public List<Pessoa> listarTodos(){
        List<Pessoa> pessoas = new ArrayList<>();
        for (int i = 0; i < 8 ; i ++){
            Pessoa pessoa = mockPessoa(i);
            pessoas.add(pessoa);
        }
        return pessoas;
    }

    public Pessoa mockPessoa(int i ) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(counter.incrementAndGet());
        pessoa.setPrimeiroNome("Primeiro Nome"+ i);
        pessoa.setUltimoNome("Segundo Nome"+ i);
        pessoa.setEndereco("Endereço"+ i );
        pessoa.setGenero("Gênero");
        return pessoa;
    }
    public void deletar(String id) {

    }
}
