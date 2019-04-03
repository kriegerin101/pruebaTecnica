package com.autentia.pruebatecnica.data;

import java.util.List;

import com.autentia.pruebatecnica.domain.Profesor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository {
    @Insert("INSERT INTO Profesor (id, nombre) VALUES (#{id},#{nombre})")
    void addProfesor (Profesor profesor);

    @Select("SELECT * FROM Profesor")
    List<Profesor> selectProfesores();
}
