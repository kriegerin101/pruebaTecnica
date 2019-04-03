package com.autentia.pruebatecnica.controller;

import com.autentia.pruebatecnica.domain.Profesor;
import com.autentia.pruebatecnica.service.ProfesorService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@SessionScoped
public class ProfesorBean implements Serializable{

    @ManagedProperty("#{profesorService}")
    private ProfesorService profesorService;

    private Profesor profesor;

    private List<Profesor> profesores;

    @PostConstruct
    public void setUp(){
        profesor = new Profesor();
        profesores = profesorService.getProfesores();
    }

    public List<Profesor> getProfesores(){
        return profesores;
    }

    public void setProfesorService(ProfesorService profesorService){
        this.profesorService = profesorService;
    }

    public ProfesorService getCursoService(){
        return this.profesorService;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void insertarProfesor(){
        profesorService.addProfesor(profesor);
    }
}
