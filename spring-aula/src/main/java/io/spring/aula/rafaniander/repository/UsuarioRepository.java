package io.spring.aula.rafaniander.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.spring.aula.rafaniander.entity.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
