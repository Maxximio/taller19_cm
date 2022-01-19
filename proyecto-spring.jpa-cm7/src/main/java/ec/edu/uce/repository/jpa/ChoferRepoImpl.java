package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Chofer;

@Repository
@Transactional
public class ChoferRepoImpl implements IChoferRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void InsertarChofer(Chofer cho) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cho);
	}

	@Override
	public Chofer buscarChofer(Integer matricula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ActualizarChofer(Chofer cho) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cho);
	}

	@Override
	public void borrarChofer(Integer matricula) {
		// TODO Auto-generated method stub
		
	}
	
}
