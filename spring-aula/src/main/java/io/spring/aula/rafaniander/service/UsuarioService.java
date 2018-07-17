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

	public Usuario salvarUsuario(Usuario usuarioAdd) {
		return usuarioRepository.save(usuarioAdd);
	}

	public void deletarUsuario(String id) {
		usuarioRepository.delete(id);
	}

	public Usuario consultarUsuario(String id) {
		return usuarioRepository.findOne(id);
	}

}
