package br.edu.unoesc.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@RequestScoped
public abstract class BancoDao<T extends MeuCodigo> {
	// como abstrata ela nao permite voc� dar um new
	// nao deixax instanciar objeto

	// EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidade");
	// // criando unidade de persistencia que possue as configura�oes do banco
	// dentro
	// // do
	// // arquivo persistencia xml que ta na apsta meta inf
	// EntityManager em = emf.createEntityManager();
	// // classe que tem os metodos que transforma tudo em sql
	// // percorre todas as classes pra ver qual tem essa anotacao pra gerar a
	// tabela
	// // no bd
	//
	// // iniciar uma trannsa��o

	@Produces
	protected EntityManagerFactory emf;
	@Produces
	protected EntityManager em;

	public BancoDao() {

	}

	public boolean salvar(T objeto) {
		conectar();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();

			if (objeto.getCodigo() == null) {
				// insert
				em.persist(objeto);
			} else {
				// update
				em.merge(objeto);
			}
			et.commit();

		} catch (Exception e) {
			et.rollback();
			return false;
		} finally {
			desconectar();
		}
		return true;
	}

	public boolean excluir(Long codigo, Class<T> classe) {
		conectar();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();

			// buscar no banco para remmover depois
			T objeto = em.find(classe, codigo);
			if (objeto != null) {
				em.remove(objeto);
			}
			et.commit();

		} catch (Exception e) {
			et.rollback();
			return false;
		} finally {
			desconectar();
		}
		return true;
	}

	public List<T> listar(String query, Class<T> classe) {
		conectar();

		try {
			return em.createNamedQuery(query, classe).getResultList();
		} finally {
			desconectar();
		}
	}

	protected void conectar() {
		emf = Persistence.createEntityManagerFactory("unidade");
		em = emf.createEntityManager();
	}

	protected void desconectar() {
		em.close();
		emf.close();
	}

	// criar metodos genericos para alterar e listar os dados
}
