package com.autentia.pruebatecnica.data;

import java.util.List;

import com.autentia.pruebatecnica.domain.Profesor;
import org.apache.ibatis.annotations.Select;

import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository {

    @Select("SELECT * FROM Profesor")
    List<Profesor> selectProfesores();

}
