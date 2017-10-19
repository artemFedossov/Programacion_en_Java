drop database if exists colegio;
create database colegio;
use colegio; -- entra a la bd Colegio
create table alumnos(
    id int auto_increment primary key,
    nombre varchar(20),
    apellido varchar(20),
    edad int,
    curso int
);
create table cursos(
    id int auto_increment primary key,
    titulo varchar(20),
    profesor varchar(20),
    dia varchar(20),
    turno varchar(20)
);
