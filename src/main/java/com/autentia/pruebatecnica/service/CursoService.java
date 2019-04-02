package com.autentia.pruebatecnica.service;


import com.autentia.pruebatecnica.domain.Curso;
import com.autentia.pruebatecnica.data.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CursoService {

    @Autowired
    CursoRepository cursoRepository;


    public List<Curso> getCursos(){
        //return Arrays.asList(new Curso(1, true, "", "Curso de Java", "Básico", 10));
        //recogerlo con unn for?
        return cursoRepository.selectCursos();
    }
    public void selectCursos(){

    }
    public void addCurso(Curso curso){
        cursoRepository.addCurso(curso);
    }
}