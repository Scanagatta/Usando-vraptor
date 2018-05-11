package placares;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.modelo.Banco;
import br.edu.unoesc.modelo.Confederacao;

@Controller
@Path("/confederacao")
public class ConfederacaoController {

	@Inject
	private Result result;

	// tem que ter sempre esse primeiro metodo em branco é a primeira URL
	// ele vai ir para a pag jsp onde de lá o form envia os dados para o metodo
	// cadastrar
	@Get("/formulario")
	public void formulario() {
	}

	@Get("/menu")
	public void menu() {

	}

	@Post("/cadastrar")
	public void cadastrar(Confederacao confederacao) {
		int posicao = -1;
		for (int i = 0; i < Banco.confederacaos.size(); i++) {
			Confederacao c = Banco.confederacaos.get(i);
			if (c.getCodigo().equals(confederacao.getCodigo())) {
				posicao = i;
			}
		}
		if (posicao != -1) {
			Banco.confederacaos.set(posicao, confederacao);
		} else {

			Banco.confederacaos.add(confederacao);
		}
		// chama o jsp que mostra a lista
		result.redirectTo(this).listar();

	}

	@Get("/listar")
	public void listar() {
		// seta na variavel do jsp a lista
		result.include("confederacaos", Banco.confederacaos);

	}

	@Get("/editar/{codigo}")
	public void editar(Long codigo) {
		for (Confederacao confederacao : Banco.confederacaos) {
			if (confederacao.getCodigo().equals(codigo)) {
				result.include("confederacao", confederacao);
				break;
			}
		}
		result.redirectTo(this).formulario();

	}

}
