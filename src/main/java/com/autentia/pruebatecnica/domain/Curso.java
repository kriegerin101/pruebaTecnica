package com.autentia.pruebatecnica.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.Objects;

public class Curso {

    private int id;
    private boolean activo;
    private int profesor;
    private String titulo;
    private String nivel;
    private int horas;

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

    public int getProfesor() {
        return profesor;
    }

    public void setProfesor(int profesor) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Curso curso = (Curso) o;

        return new EqualsBuilder()
                .append(id, curso.id)
                .append(activo, curso.activo)
                .append(profesor, curso.profesor)
                .append(titulo, curso.titulo)
                .append(nivel, curso.nivel)
                .append(horas, curso.horas)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, activo, profesor, titulo, nivel, horas);
    }


}
