package io.spring.aula.rafaniander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.spring.aula.rafaniander.entity.Perfil;
import io.spring.aula.rafaniander.service.PerfilService;

@RestController
public class PerfilController {

	@Autowired
	PerfilService perfilService;

	@RequestMapping(value = "/perfil", method = RequestMethod.GET)
	public List<Perfil> listaPerfil() {
		return perfilService.listaPerfil();
	}

	@RequestMapping(value = "/perfil/{id}", method = RequestMethod.GET)
	public Perfil getById(@PathVariable String id) {
		return perfilService.getById(id);
	}

	@RequestMapping(value = "/perfil/{page}/{count}", method = RequestMethod.GET)
	public Page<Perfil> listaPaginada(@PathVariable int page, @PathVariable int count) {
		return perfilService.listaPaginada(count, page);
	}

	@RequestMapping(value = "/perfil", method = RequestMethod.POST)
	public Perfil salvarPerfil(@RequestBody Perfil perfil) {
		return perfilService.salvarPerfil(perfil);
	}

	@RequestMapping(value = "/perfil", method = RequestMethod.PUT)
	public Perfil editarPerfil(@RequestBody Perfil perfil) {
		return perfilService.salvarPerfil(perfil);
	}

	@RequestMapping(value = "/perfil/{id}", method = RequestMethod.DELETE)
	public void deletarPerfil(@PathVariable String id) {
		perfilService.deletarPerfil(id);
	}

}
