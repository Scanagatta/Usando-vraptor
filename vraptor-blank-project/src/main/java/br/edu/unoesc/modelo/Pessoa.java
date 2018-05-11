package br.edu.unoesc.modelo;

public class Pessoa {
	private String codigo;
	private String nome;
	Cidade cidade;

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

}
