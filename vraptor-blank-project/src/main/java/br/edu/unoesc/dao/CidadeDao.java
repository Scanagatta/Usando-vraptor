package br.edu.unoesc.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import br.edu.unoesc.modelo.Cidade;

public class CidadeDao extends BancoDao<Cidade> {

	public List<Cidade> pesquisarPorSigla(String sigla) {
		conectar();
		try {
			TypedQuery<Cidade> tq = em.createNamedQuery(Cidade.PESQUISAR_POR_SIGLA, Cidade.class);
			tq.setParameter(1, sigla);
			return tq.getResultList();
		} finally {

			desconectar();

		}

	}

}
