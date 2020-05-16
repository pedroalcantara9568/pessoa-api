package com.example.rest.dto.mapper;

import com.example.rest.dto.PessoaDTO;
import com.example.rest.dto.mapper.mocks.MockPessoa;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import java.util.*;

public class DozerConversorTest {

    MockPessoa inputObject;

    @Before
    public void setUp(){
        inputObject = new MockPessoa();
    }

    @Test
    @DisplayName("Converte entidade Pessoa em PessoaDTO")
    public void parseEntityToDTOTest() {
        PessoaDTO saida = DozerConversor.parseObject(inputObject.mockEntity(), PessoaDTO.class);
        Assertions.assertEquals(Long.valueOf(0L), saida.getId());
        Assertions.assertEquals("Pedro0", saida.getPrimeiroNome());
        Assertions.assertEquals("Alcântara0", saida.getUltimoNome());
        Assertions.assertEquals("Endereço0", saida.getEndereco());
        Assertions.assertEquals("Genero0", saida.getGenero());
    }

    @Test
    @DisplayName("Converte lista de Pessoas em lista de PessoasDTO")
    public void parseEntityListToDTOListTest() {
        List<PessoaDTO> saidaLista = DozerConversor.parseListObjects(inputObject.mockEntityList(), PessoaDTO.class);
        PessoaDTO saidaZero = saidaLista.get(0);

        Assertions.assertEquals(Long.valueOf(0L), saidaZero.getId());
        Assertions.assertEquals("Pedro0", saidaZero.getPrimeiroNome());
        Assertions.assertEquals("Alcântara0", saidaZero.getUltimoNome());
        Assertions.assertEquals("Endereço0", saidaZero.getEndereco());
        Assertions.assertEquals("Genero0", saidaZero.getGenero());

        PessoaDTO saidaSete = saidaLista.get(7);

        Assertions.assertEquals(Long.valueOf(7L), saidaSete.getId());
        Assertions.assertEquals("Pedro7", saidaSete.getPrimeiroNome());
        Assertions.assertEquals("Alcântara7", saidaSete.getUltimoNome());
        Assertions.assertEquals("Endereço7", saidaSete.getEndereco());
        Assertions.assertEquals("Genero7", saidaSete.getGenero());
    }

    @Test
    @DisplayName("Converte PessoaDTO em Entidade Pessoa")
    public void parseDTOToEntityTest() {
        PessoaDTO saida = DozerConversor.parseObject(inputObject.mockEntity(), PessoaDTO.class);
        Assertions.assertEquals(Long.valueOf(0L), saida.getId());
        Assertions.assertEquals("Pedro0", saida.getPrimeiroNome());
        Assertions.assertEquals("Alcântara0", saida.getUltimoNome());
        Assertions.assertEquals("Endereço0", saida.getEndereco());
        Assertions.assertEquals("Genero0", saida.getGenero());
    }

    @Test
    @DisplayName("Converte lista de Pessoas em lista de PessoasDTO")
    public void parseDTOListToEntityListTest() {
        List<PessoaDTO> saidaLista = DozerConversor.parseListObjects(inputObject.mockEntityList(), PessoaDTO.class);
        PessoaDTO saidaZero = saidaLista.get(0);

        Assertions.assertEquals(Long.valueOf(0L), saidaZero.getId());
        Assertions.assertEquals("Pedro0", saidaZero.getPrimeiroNome());
        Assertions.assertEquals("Alcântara0", saidaZero.getUltimoNome());
        Assertions.assertEquals("Endereço0", saidaZero.getEndereco());
        Assertions.assertEquals("Genero0", saidaZero.getGenero());

        PessoaDTO saidaSete = saidaLista.get(7);

        Assertions.assertEquals(Long.valueOf(7L), saidaSete.getId());
        Assertions.assertEquals("Pedro7", saidaSete.getPrimeiroNome());
        Assertions.assertEquals("Alcântara7", saidaSete.getUltimoNome());
        Assertions.assertEquals("Endereço7", saidaSete.getEndereco());
        Assertions.assertEquals("Genero7", saidaSete.getGenero());
    }


}
