package com.autentia.pruebatecnica.data;

import java.util.List;

import com.autentia.pruebatecnica.domain.Curso;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository {

    @Insert("INSERT INTO Curso (id, activo, profesor, titulo, nivel, horas) VALUES (#{id},#{activo},#{profesor},#{titulo}, #{nivel}, #{horas})")
    void addCurso (Curso curso);

    @Select("SELECT * FROM Curso WHERE activo=true")
    @Delete("DELETE * FROM Curso WHERE id = (#{id})")
    List<Curso> selectCursos();



}
