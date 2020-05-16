package com.example.rest.dto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

public class PessoaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String primeiroNome;
    private String ultimoNome;
    private String Endereco;
    private String genero;

    public PessoaDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaDTO pessoaDTO = (PessoaDTO) o;
        return Objects.equals(id, pessoaDTO.id) &&
                Objects.equals(primeiroNome, pessoaDTO.primeiroNome) &&
                Objects.equals(ultimoNome, pessoaDTO.ultimoNome) &&
                Objects.equals(Endereco, pessoaDTO.Endereco) &&
                Objects.equals(genero, pessoaDTO.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, primeiroNome, ultimoNome, Endereco, genero);
    }
}
