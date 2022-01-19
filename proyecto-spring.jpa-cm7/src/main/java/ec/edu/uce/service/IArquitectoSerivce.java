package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Arquitecto;

public interface IArquitectoSerivce {

	void InsertarArquitectoService(Arquitecto arq);
	
	Arquitecto buscarArquitectoService(Integer id);
	
	void ActualizarArquitectoService(Arquitecto arq);
	
	void borrarArquitectoService(Integer id);
	
}
