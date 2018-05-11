package br.edu.unoesc.modelo;

public class Equipe {

	private Long codigo;
	private String nome;
	private String serie;
	private Confederacao confederacao = new Confederacao();
	private Long pontos = 0l;

	public Equipe() {
	}

	public Equipe(Long codigo, String nome, String serie, Confederacao confederacao, Long pontos) {
		this.codigo = codigo;
		this.nome = nome;
		this.serie = serie;
		this.confederacao = confederacao;
		this.pontos = pontos;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Confederacao getConfederacao() {
		return confederacao;
	}

	public void setConfederacao(Confederacao confederacao) {
		this.confederacao = confederacao;
	}

	public Long getPontos() {
		return pontos;
	}

	public void setPontos(Long pontos) {
		this.pontos = pontos;
	}

}
