package com.autentia.pruebatecnica.controller;

import com.autentia.pruebatecnica.domain.Profesor;
import com.autentia.pruebatecnica.service.ProfesorService;

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

    public List<Profesor> getProfesores(){
        return profesorService.getProfesores();
    }

    public void setProfesorService(ProfesorService profesorService){
        this.profesorService = profesorService;
    }


}
