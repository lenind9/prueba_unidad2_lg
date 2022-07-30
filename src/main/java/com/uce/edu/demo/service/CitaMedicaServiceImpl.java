package com.uce.edu.demo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.CitaMedica;
import com.uce.edu.demo.repository.ICitaMedicaRepository;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {
	
	private static final Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	
	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.insertar(citaMedica);
		LOG.info("Se ha insertado: " + citaMedica);
	}

	@Override
	public CitaMedica buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepository.buscar(id);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.actualizar(citaMedica);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.eliminar(id);
	}

	@Override
	public CitaMedica buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepository.buscarPorNumero(numero);
	}

}
