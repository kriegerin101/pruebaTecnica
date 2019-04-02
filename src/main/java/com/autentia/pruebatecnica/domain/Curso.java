package com.autentia.pruebatecnica.domain;

public class Curso {
    private int id;
    private boolean activo;
    private String profesor;
    private String titulo;
    private String nivel;
    private int horas;

    public Curso(int id, boolean activo, String profesor, String titulo, String nivel, int horas) {
        this.id = id;
        this.activo = activo;
        this.profesor = profesor;
        this.titulo = titulo;
        this.nivel = nivel;
        this.horas = horas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}
