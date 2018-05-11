package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;

@Controller
@Path("/calculadora")
public class CalculadoraController {

	@Inject
	private Result result;

	@Post("/somar")
	public void somar(Long numero1, Long numero2) {
		Long soma = numero1 + numero2;
		result.include("soma", soma);
	}

	@Get("/formulario")
	public void formulario() {

	}

}
