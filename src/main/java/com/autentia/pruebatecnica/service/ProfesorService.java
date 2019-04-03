package com.autentia.pruebatecnica.service;

import com.autentia.pruebatecnica.domain.Profesor;
import com.autentia.pruebatecnica.data.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProfesorService {
    @Autowired
    ProfesorRepository profesorRepository;


    public List<Profesor> getProfesores(){
        return profesorRepository.selectProfesores();
    }

    public void addProfesor(Profesor profesor){
        profesorRepository.addProfesor(profesor);
    }
}
