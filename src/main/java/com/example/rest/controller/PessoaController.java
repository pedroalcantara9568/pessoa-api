package com.example.rest.controller;
import java.util.*;
import com.example.rest.model.Pessoa;
import com.example.rest.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> listarTodas() {
        return pessoaService.listarTodos();
    }

    @GetMapping("/{id}")
    public Pessoa procurarPorId(@PathVariable("id") Long id) {
        return pessoaService.procurarPorId(id);
    }

    @PostMapping
    public Pessoa criar(@RequestBody Pessoa pessoa) {
        return pessoaService.criar(pessoa);
    }

    @PutMapping
    public Pessoa atualizar(@RequestBody Pessoa pessoa) {
        return pessoaService.atualizar(pessoa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable("id") Long id) {
      pessoaService.deletar(id);
      return ResponseEntity.ok().build();
    }

}
