package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Doctor;
import ec.edu.uce.repository.jpa.IDoctorRepo;

@Service
public class DoctorServiceImpl implements IDoctorService{

	@Autowired
	private IDoctorRepo docRepo;
	
	@Override
	public void InsertarDoctorService(Doctor doctor) {
		// TODO Auto-generated method stub
		this.docRepo.InsertarDoctor(doctor);
	}

	@Override
	public Doctor buscarDoctorService(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ActualizarDoctorService(Doctor doctor) {
		// TODO Auto-generated method stub
		this.docRepo.ActualizarDoctor(doctor);
	}

	@Override
	public void borrarDoctorService(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
