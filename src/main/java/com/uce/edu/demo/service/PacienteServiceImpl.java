package com.uce.edu.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Paciente;
import com.uce.edu.demo.modelo.PacienteSencillo;
import com.uce.edu.demo.repository.IPacienteRepository;

@Service
public class PacienteServiceImpl implements IPacienteService {
	
	private static final Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Autowired
	private IPacienteRepository pacienteRepository;
	
	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.insertar(paciente);
		LOG.info("Se ha insertado:" + paciente);
	}

	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.buscar(id);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.actualizar(paciente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.pacienteRepository.eliminar(id);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.buscarPorCedula(cedula);
	}

	@Override
	public List<PacienteSencillo> reporte(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.reporte(fecha, genero);
	}

}
