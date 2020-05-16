package com.example.rest.controller;
import java.util.*;

import com.example.rest.dto.PessoaDTO;
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
    public List<PessoaDTO> listarTodas() {
        return pessoaService.listarTodos();
    }

    @GetMapping("/{id}")
    public PessoaDTO procurarPorId(@PathVariable("id") Long id) {
        return pessoaService.procurarPorId(id);
    }

    @PostMapping
    public PessoaDTO criar(@RequestBody PessoaDTO pessoa) {
        return pessoaService.criar(pessoa);
    }

    @PutMapping
    public PessoaDTO atualizar(@RequestBody PessoaDTO pessoa) {
        return pessoaService.atualizar(pessoa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable("id") Long id) {
      pessoaService.deletar(id);
      return ResponseEntity.ok().build();
    }

}
