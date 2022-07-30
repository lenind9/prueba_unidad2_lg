package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.CitaMedica;

@Service
public class GestorCitaServiceImpl implements IGestorCitaService {
	
	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	@Override
	public void agendamientoCitaMedica(String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente) {
		// TODO Auto-generated method stub
		CitaMedica cita = new CitaMedica();
		cita.setNumeroCita(numeroCita);
		cita.setFechaCita(fechaCita);
		cita.setValorCita(valorCita);
		cita.setLugarCita(lugarCita);
		cita.setDoctor(this.doctorService.buscarPorCedula(cedulaDoctor));
		cita.setPaciente(this.pacienteService.buscarPorCedula(cedulaPaciente));
		this.citaMedicaService.insertar(cita);
	}

	@Override
	public void actualizacionCitaMedica(String numeroCita, String diagnostico, String receta, LocalDateTime fechaProximaCita) {
		// TODO Auto-generated method stub
		CitaMedica cita = this.citaMedicaService.buscarPorNumero(numeroCita);
		cita.setDiagnostico(diagnostico);
		cita.setReceta(receta);
		cita.setFechaProximaCita(fechaProximaCita);
		this.citaMedicaService.actualizar(cita);
	}

	@Override
	public void reportePacientes(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		this.pacienteService.reporte(fecha, genero);
	}
	
}
