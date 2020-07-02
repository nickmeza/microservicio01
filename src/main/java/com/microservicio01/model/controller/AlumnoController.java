package com.microservicio01.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio01.model.dao.AlumnoDao;
import com.microservicio01.model.entity.Alumno;

@RestController
public class AlumnoController {
	@Autowired
	private AlumnoDao alumnoDao;
	
	
	@GetMapping("/listar")
	public List<Alumno> readAll(){
		return alumnoDao.readAll();
	}
	@GetMapping("/listar/{id}")
	public Alumno readById(@PathVariable Long id){
		return alumnoDao.readById(id);
	}
}
