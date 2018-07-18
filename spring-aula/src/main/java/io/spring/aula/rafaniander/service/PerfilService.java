package io.spring.aula.rafaniander.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import io.spring.aula.rafaniander.entity.Perfil;
import io.spring.aula.rafaniander.repository.PerfilRepository;

@Service
public class PerfilService {

	@Autowired
	PerfilRepository perfilRepository;

	public List<Perfil> listaPerfil() {
		return perfilRepository.findAll();
	}

	public Page<Perfil> listaPaginada(int count, int page) {
		Pageable pages = new PageRequest(page, count);
		return perfilRepository.findAll(pages);
	}

	public Perfil salvarPerfil(Perfil perfilAdd) {
		return perfilRepository.save(perfilAdd);
	}

	public void deletarPerfil(String id) {
		perfilRepository.delete(id);
	}

	public Perfil getById(String id) {
		return perfilRepository.findOne(id);
	}

}
