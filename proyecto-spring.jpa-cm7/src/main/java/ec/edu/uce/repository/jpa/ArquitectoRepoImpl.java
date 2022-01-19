package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Arquitecto;

@Repository
@Transactional
public class ArquitectoRepoImpl implements IArquitectoRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void InsertarArquitecto(Arquitecto arqui) {
		this.entityManager.persist(arqui);
	}

	@Override
	public Arquitecto buscarArquitecto(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ActualizarArquitecto(Arquitecto arqui) {
		this.entityManager.merge(arqui);
	}

	@Override
	public void borrarArquitecto(Integer id) {
		// TODO Auto-generated method stub
		
	}
}
