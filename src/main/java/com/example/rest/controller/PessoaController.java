package com.example.rest.controller;
import java.util.*;
import com.example.rest.model.Pessoa;
import com.example.rest.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @RequestMapping(method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pessoa> listarTodas() {
        return pessoaService.listarTodos();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa procurarPorId(@PathVariable("id") String id) {
        return pessoaService.procurarPorId(id);
    }

    @RequestMapping(method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa criar(@RequestBody Pessoa pessoa) {
        return pessoaService.criar(pessoa);
    }

    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa atualizar(@RequestBody Pessoa pessoa) {
        return pessoaService.atualizar(pessoa);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable("id") String id) {
      pessoaService.deletar(id);
    }

}
