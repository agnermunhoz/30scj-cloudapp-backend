package com.fiap.contatos.listacontatos.controller;

import com.fiap.contatos.listacontatos.model.Contato;
import com.fiap.contatos.listacontatos.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
public class ContatoController {


    private ContatoRepository contatoRepository;

    @Autowired
    public ContatoController(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }



    @GetMapping("/lista")
    public ResponseEntity<List<Contato>> getContatos(){

        List<Contato>contatos = null;

        contatos = contatoRepository.findAll();

        return ResponseEntity.ok(contatos);
    }


    @PostMapping
    public ResponseEntity<Contato> postContato(@RequestBody Contato contato){

        contatoRepository.save(contato);

        return ResponseEntity.ok(contato);
    }
}
