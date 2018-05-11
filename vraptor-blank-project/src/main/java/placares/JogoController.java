package placares;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.modelo.Banco;
import br.edu.unoesc.modelo.Confederacao;
import br.edu.unoesc.modelo.Equipe;
import br.edu.unoesc.modelo.Jogo;

@Controller
@Path("/jogo")
public class JogoController {

	@Inject
	private Result result;

	@Get("/formulario")
	public void formulario() {
		result.include("equipes", Banco.equipes);
	}

	@Post("/cadastrar")
	public void cadastrar(Jogo jogo) {
		int posicao1 = -1;
		int posicao2 = -1;
		int contador = -1;
		for (Equipe e : Banco.equipes) {
			contador++;
			if (e.getCodigo().equals(jogo.getEquipe1().getCodigo())) {
				jogo.setEquipe1(e);
				posicao1 = contador;
			}
			if (e.getCodigo().equals(jogo.getEquipe2().getCodigo())) {
				jogo.setEquipe2(e);
				posicao2 = contador;
			}
		}
		Equipe e1 = jogo.getEquipe1();
		e1.setPontos(e1.getPontos() + jogo.calcularPontosEquipe1());
		Equipe e2 = jogo.getEquipe2();
		e2.setPontos(e2.getPontos() + jogo.calcularPontosEquipe2());
		Banco.equipes.set(posicao1, e1);
		Banco.equipes.set(posicao2, e2);

		int posicaojogo = -1;
		for (int i = 0; i < Banco.jogos.size(); i++) {
			Jogo j = Banco.jogos.get(i);
			if (j.getCodigo().equals(jogo.getCodigo())) {
				posicaojogo = i;
			}
		}

		if (posicaojogo != -1) {
			Banco.jogos.set(posicaojogo, jogo);
		} else {

			Banco.jogos.add(jogo);
		}

		result.redirectTo(this).listar();
	}

	@Get("/listar")
	public void listar() {
		result.include("jogos", Banco.jogos);
	}

	@Get("/editar/{codigo}")
	public void editar(Long codigo) {
		for (Jogo jogo : Banco.jogos) {
			if (jogo.getCodigo().equals(codigo)) {
				result.include("jogo", jogo);
				break;
			}
		}
		result.redirectTo(this).formulario();

	}

}