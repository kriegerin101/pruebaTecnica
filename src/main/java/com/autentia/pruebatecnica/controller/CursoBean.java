package com.autentia.pruebatecnica.controller;

import com.autentia.pruebatecnica.Curso;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

@ManagedBean
@SessionScoped
public class CursoBean implements Serializable{
    private Curso curso;
    private List<Curso> cursos = new ArrayList<Curso>();
}
