package br.edu.unoesc.modelo;

public class Jogo {

	private Long codigo;
	private Equipe equipe1 = new Equipe();
	private Equipe equipe2 = new Equipe();
	private Long resultado1;
	private Long resultado2;

	public Jogo() {
	}

	public Jogo(Long codigo, Equipe equipe1, Equipe equipe2, Long resultado1, Long resultado2) {
		super();
		this.codigo = codigo;
		this.equipe1 = equipe1;
		this.equipe2 = equipe2;
		this.resultado1 = resultado1;
		this.resultado2 = resultado2;
	}

	public Long calcularPontosEquipe1() {
		if (resultado1 > resultado2) {
			return 3l;
		} else if (resultado1 < resultado2) {
			return 0l;
		}
		return 1l;
	}

	public Long calcularPontosEquipe2() {
		if (resultado2 > resultado1) {
			return 3l;
		} else if (resultado2 < resultado1) {
			return 0l;
		}
		return 1l;
	}

	public Equipe getEquipe1() {
		return equipe1;
	}

	public void setEquipe1(Equipe equipe1) {
		this.equipe1 = equipe1;
	}

	public Equipe getEquipe2() {
		return equipe2;
	}

	public void setEquipe2(Equipe equipe2) {
		this.equipe2 = equipe2;
	}

	public Long getResultado1() {
		return resultado1;
	}

	public void setResultado1(Long resultado1) {
		this.resultado1 = resultado1;
	}

	public Long getResultado2() {
		return resultado2;
	}

	public void setResultado2(Long resultado2) {
		this.resultado2 = resultado2;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

}
