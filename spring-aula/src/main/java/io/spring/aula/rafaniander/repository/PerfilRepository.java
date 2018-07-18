package io.spring.aula.rafaniander.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.spring.aula.rafaniander.entity.Perfil;

public interface PerfilRepository extends MongoRepository<Perfil, String> {

	Perfil findByNome(String nome);

}
