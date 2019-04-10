

CREATE SCHEMA IF NOT EXISTS autentia;


CREATE TABLE Curso (
                       `id` int NOT NULL auto_increment,
                       `activo` boolean  NOT NULL,
                       `profesor` varchar(255) NOT NULL,
                       `titulo` varchar(255) NOT NULL,
                       `nivel` varchar(255) NOT NULL,
                       `horas` int NOT NULL
);

CREATE TABLE Profesor (
                          `id` int NOT NULL,
                          `nombre` varchar(255) NOT NULL
) ;


INSERT INTO Profesor VALUES
(1, 'Roberto Canales Mora'),
(2, 'Mercedes Martin Guerrero');

//INSERT INTO Curso VALUES (0, true, "prueba 2", "Intermedio 2", 1, 2);


