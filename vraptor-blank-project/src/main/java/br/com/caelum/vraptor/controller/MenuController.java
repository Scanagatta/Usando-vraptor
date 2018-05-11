package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;

@Controller
@Path("/menu")
public class MenuController {

	//@Inject
	//private Result result;

	// tem que ter sempre esse primeiro metodo em branco é a primeira URL
	// ele vai ir para a pag jsp onde de lá o form envia os dados para o metodo
	// cadastrar
	@Get("/menu")
	public void menu() {
		
	}

	@Get("/menujogo")
	public void menujogo() {
		
	}
}
