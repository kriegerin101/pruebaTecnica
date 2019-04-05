package com.autentia.pruebatecnica.service;


import com.autentia.pruebatecnica.domain.Curso;
import com.autentia.pruebatecnica.data.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    CursoRepository cursoRepository;

    public void setCursoRepository(CursoRepository cursoRepository){
        this.cursoRepository = cursoRepository;
    }

    public CursoRepository getCursoRepository(){
        return cursoRepository;
    }

    public List<Curso> getCursos(){
        return cursoRepository.selectCursos();
    }

    public void addCurso(Curso curso){
        cursoRepository.addCurso(curso);
    }

}