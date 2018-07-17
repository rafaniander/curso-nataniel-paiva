package io.spring.aula.rafaniander.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.aula.rafaniander.entity.Usuario;
import io.spring.aula.rafaniander.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public List<Usuario> listaUsuario() {
		return usuarioRepository.findAll();
	}

	public List<Usuario> listaUsuario(Usuario usuarioAdd) {
		usuarioRepository.save(usuarioAdd);
		return listaUsuario();
	}

}
