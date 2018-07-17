package io.spring.aula.rafaniander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.spring.aula.rafaniander.entity.Usuario;
import io.spring.aula.rafaniander.service.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public List<Usuario> listaUsuario() {
		return usuarioService.listaUsuario();
	}

	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET)
	public Usuario getById(@PathVariable String id) {
		return usuarioService.getById(id);
	}

	@RequestMapping(value = "/usuario/{page}/{count}", method = RequestMethod.GET)
	public Page<Usuario> listaPaginada(@PathVariable int page, @PathVariable int count) {
		return usuarioService.listaPaginada(count, page);
	}

	@RequestMapping(value = "/usuario/{nome}/nome", method = RequestMethod.GET)
	public List<Usuario> listaPaginada(@PathVariable String nome) {
		return usuarioService.buscaPorNome(nome);
	}

	@RequestMapping(value = "/usuario", method = RequestMethod.POST)
	public Usuario salvarUsuario(@RequestBody Usuario usuario) {
		return usuarioService.salvarUsuario(usuario);
	}

	@RequestMapping(value = "/usuario", method = RequestMethod.PUT)
	public Usuario editarUsuario(@RequestBody Usuario usuario) {
		return usuarioService.salvarUsuario(usuario);
	}

	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.DELETE)
	public void deletarUsuario(@PathVariable String id) {
		usuarioService.deletarUsuario(id);
	}

}
