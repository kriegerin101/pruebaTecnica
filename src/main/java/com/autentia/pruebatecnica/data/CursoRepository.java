package com.autentia.pruebatecnica.data;

import java.util.List;

import com.autentia.pruebatecnica.Curso;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.autentia.pruebatecnica.controller.CursoBean;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository {
    //falta conexion con bbdd?
    //falta crear sesion con mybatis spring sqlsessionfactory
    @Insert("INSERT INTO catalogo (id, activo, profesor, titulo, nivel) VALUES (#{id},#{activo},#{profesor},#{titulo}, #{nivel})")
    void addCurso (Curso curso);

    @Select("SELECT * FROM catalogo")
    List<Curso> selectCursos();
}
