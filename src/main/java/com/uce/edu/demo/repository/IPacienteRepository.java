package com.uce.edu.demo.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.modelo.Paciente;

public interface IPacienteRepository {
	public void insertar(Paciente paciente);
	public Paciente buscar(Integer id);
	public void actualizar(Paciente paciente);
	public void eliminar(Integer id);
	
	public Paciente buscarPorCedula(String cedula);
	public void reporte(LocalDateTime fecha, String genero);
}
