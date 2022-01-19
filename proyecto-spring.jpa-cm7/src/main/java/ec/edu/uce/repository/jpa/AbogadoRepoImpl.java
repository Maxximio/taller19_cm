package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Abogado;

@Repository
@Transactional
public class AbogadoRepoImpl implements IAbogadoRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void InsertarAbogado(Abogado abo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(abo);
	}

	@Override
	public Abogado buscarAbogado(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ActualizarAbogado(Abogado abo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(abo);
	}

	@Override
	public void borrarAbogado(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
}
