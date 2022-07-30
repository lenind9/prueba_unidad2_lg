package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Doctor;
import com.uce.edu.demo.modelo.Paciente;
import com.uce.edu.demo.service.IDoctorService;
import com.uce.edu.demo.service.IGestorCitaService;
import com.uce.edu.demo.service.IPacienteService;

@SpringBootApplication
public class PruebaU2P2LgApplication implements CommandLineRunner {
	
	private static final Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IGestorCitaService gestorCitaService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaU2P2LgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//1) Ingreso de 2 doctores
		Doctor doc1 = new Doctor();
		doc1.setCedula("1754223164");
		doc1.setNombre("Daniel");
		doc1.setApellido("Sanchez");
		doc1.setFechaNacimiento(LocalDateTime.of(1975, 8, 20, 9, 45, 15));
		doc1.setNumeroConsultorio("A15");
		doc1.setCodigoSenescyt("1654");
		doc1.setGenero("M");
		this.doctorService.insertar(doc1);
		
		Doctor doc2 = new Doctor();
		doc2.setCedula("1749960012");
		doc2.setNombre("Alejandra");
		doc2.setApellido("Benavides");
		doc2.setFechaNacimiento(LocalDateTime.of(1980, 2, 7, 12, 50, 55));
		doc2.setNumeroConsultorio("D09");
		doc2.setCodigoSenescyt("4511");
		doc2.setGenero("F");
		this.doctorService.insertar(doc2);
		
		//2) Ingreso de 2 pacientes
		Paciente pac1 = new Paciente();
		pac1.setCedula("1750364498");
		pac1.setNombre("Joselyn");
		pac1.setApellido("Aldaz");
		pac1.setFechaNacimiento(LocalDateTime.of(1972, 12, 29, 9, 29, 15));
		pac1.setCodigoSeguro("16664558");
		pac1.setEstatura(1.67);
		pac1.setPeso(61.2);
		pac1.setGenero("F");
		this.pacienteService.insertar(pac1);
		
		Paciente pac2 = new Paciente();
		pac2.setCedula("0846672029");
		pac2.setNombre("Angel");
		pac2.setApellido("Jimenez");
		pac2.setFechaNacimiento(LocalDateTime.of(1999, 11, 1, 22, 0, 15));
		pac2.setCodigoSeguro("66214577");
		pac2.setEstatura(1.74);
		pac2.setPeso(70.5);
		pac2.setGenero("M");
		this.pacienteService.insertar(pac2);
		
		//3) Agendamiento de cita medica
		this.gestorCitaService.agendamientoCitaMedica("237", LocalDateTime.of(2022, 10, 29, 10, 0, 0), new BigDecimal(15), "Hospital Vozandes Carapungo", "1749960012", "0846672029");
		
		//4) Actualizacion de cita medica
		this.gestorCitaService.actualizacionCitaMedica("237", "Faringitis", "Penicilina", LocalDateTime.of(2022, 11, 29, 10,0, 0));
		
		//5) Reporte de pacientes
		this.gestorCitaService.reportePacientes(LocalDateTime.of(1980, 12, 1, 0, 0, 0), "M");
		
	}

}
