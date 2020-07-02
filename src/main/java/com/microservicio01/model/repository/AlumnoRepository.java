package com.microservicio01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio01.model.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long>{
	
}
