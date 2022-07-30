package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.CitaMedica;

public interface ICitaMedicaService {
	public void insertar(CitaMedica citaMedica);
	public CitaMedica buscar(Integer id);
	public void actualizar(CitaMedica citaMedica);
	public void eliminar(Integer id);
	
	public CitaMedica buscarPorNumero(String numero);
}
