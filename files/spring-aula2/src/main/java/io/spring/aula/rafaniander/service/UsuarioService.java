package io.spring.aula.rafaniander.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import io.spring.aula.rafaniander.entity.Usuario;

@Service
public class UsuarioService {

	public List<Usuario> listaUsuario() {
		List<Usuario> usuarios = new ArrayList<>();

		usuarios.add(new Usuario("Rafael", "rafaelmarques1992@gmail.com", 25));
		usuarios.add(new Usuario("Eduardo", "edubinatti@gmail.com", 25));

		return usuarios;
	}

	public List<Usuario> listaUsuario(Usuario usuario) {
		List<Usuario> usuarios = listaUsuario();
		usuarios.add(usuario);

		return usuarios;
	}

}
