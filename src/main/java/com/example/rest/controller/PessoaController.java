package com.example.rest.controller;

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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa findById(@PathVariable("id") String id) {
        return pessoaService.findById(id);
    }


}
