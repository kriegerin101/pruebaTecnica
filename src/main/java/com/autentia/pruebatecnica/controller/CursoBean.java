package com.autentia.pruebatecnica.controller;

import com.autentia.pruebatecnica.domain.Curso;
import com.autentia.pruebatecnica.service.CursoService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@SessionScoped
public class CursoBean implements Serializable{

    @ManagedProperty("#{cursoService}")
    private CursoService cursoService;

    private Curso curso;

    private List<Curso> cursos;

    public List<Curso> getCursos(){return cursoService.getCursos();}

    public void setCursoService(CursoService cursoService){
        this.cursoService = cursoService;
    }

    public CursoService getCursoService(){
        return this.cursoService;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void insertarCurso(){
        cursoService.addCurso(curso);
    }
}
