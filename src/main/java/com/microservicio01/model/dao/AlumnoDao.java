package com.microservicio01.model.dao;

import java.util.List;

import com.microservicio01.model.entity.Alumno;

public interface AlumnoDao {
	public List<Alumno> readAll();
	public Alumno readById(Long id);
}
