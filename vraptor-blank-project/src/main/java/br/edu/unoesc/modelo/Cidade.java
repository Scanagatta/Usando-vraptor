package br.edu.unoesc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import br.edu.unoesc.dao.MeuCodigo;

@Entity
@NamedQueries({ @NamedQuery(name = Cidade.LISTAR_CIDADES, query = "from Cidade"),
		@NamedQuery(name = Cidade.PESQUISAR_POR_SIGLA, query = "from Cidade where uf = ?1") })

public class Cidade implements MeuCodigo {

	// constante para fazer a query
	public static final String LISTAR_CIDADES = "listarCidades";
	public static final String PESQUISAR_POR_SIGLA = "pesquisarPorSigla";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false, length = 2)
	private String uf;

	public Cidade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cidade(String nome, String sigla) {
		super();
		this.nome = nome;
		this.uf = sigla;
	}

	public Cidade(Long codigo, String nome, String uf) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.uf = uf;
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

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
