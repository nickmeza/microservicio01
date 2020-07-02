package com.microservicio01.model.servicioImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicio01.model.dao.AlumnoDao;
import com.microservicio01.model.entity.Alumno;
import com.microservicio01.model.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoDao{
	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll();
	}

	@Override
	public Alumno readById(Long id) {
		// TODO Auto-generated method stub
		return alumnoRepository.findById(id).orElse(null);
	}
	
}
