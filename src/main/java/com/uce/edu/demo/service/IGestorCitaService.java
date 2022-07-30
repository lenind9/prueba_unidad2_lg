package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorCitaService {
	public void agendamientoCitaMedica(String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita, String cedulaDoctor, String cedulaPaciente);
	public void actualizacionCitaMedica(String numeroCita, String diagnostico, String receta, LocalDateTime fechaProximaCita);
	public void reportePacientes(LocalDateTime fecha, String genero);
}
