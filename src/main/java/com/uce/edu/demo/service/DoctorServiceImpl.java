package com.uce.edu.demo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Doctor;
import com.uce.edu.demo.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService {
	
	private static final Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Autowired
	private IDoctorRepository doctorRepository;
	
	@Override
	public void insertar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.insertar(doctor);
		LOG.info("Se ha insertado: " + doctor);
	}

	@Override
	public Doctor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.doctorRepository.buscar(id);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.actualizar(doctor);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.doctorRepository.eliminar(id);
	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.doctorRepository.buscarPorCedula(cedula);
	}

}
