package com.uce.edu.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.modelo.Paciente;
import com.uce.edu.demo.modelo.PacienteSencillo;

public interface IPacienteService {
	public void insertar(Paciente paciente);
	public Paciente buscar(Integer id);
	public void actualizar(Paciente paciente);
	public void eliminar(Integer id);
	
	public Paciente buscarPorCedula(String cedula);
	public List<PacienteSencillo> reporte(LocalDateTime fecha, String genero);
}
