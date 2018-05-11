package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.modelo.Banco;
import br.edu.unoesc.modelo.Cidade;
import br.edu.unoesc.modelo.Pessoa;

@Controller
@Path("/pessoa")
public class PessoaController {

	@Inject
	private Result result;

	// tem que ter sempre esse primeiro metodo em branco é a primeira URL
	// ele vai ir para a pag jsp onde de lá o form envia os dados para o metodo
	// cadastrar
	@Get("/formulario")
	public void formulario() {
		result.include("cidades", Banco.cidades);
	}

	@Get("/listar")
	public void listar() {
		// seta na variavel do jsp a lista
		result.include("pessoas", Banco.pessoas);
	}

	// insere a pessoa no banco
	@Post("/cadastrar")
	public void cadastrar(Pessoa pessoa) {

		for (Cidade cidade : Banco.cidades) {
			if (cidade.getCodigo().equals(pessoa.getCidade().getCodigo())) {
				pessoa.setCidade(cidade);
				break;
			}
		}

		Banco.pessoas.add(pessoa);
		// chama o jsp que mostra a lista
		result.redirectTo(this).listar();
	}

}
