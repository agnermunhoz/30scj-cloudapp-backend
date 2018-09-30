package com.fiap.contatos.listacontatos.repository;

import com.fiap.contatos.listacontatos.model.Contato;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContatoRepository extends MongoRepository<Contato,String> {
}
