create database if not exists ControleTech;
use ControleTech;

drop table if exists funcionarios;
drop table if exists usuarios;
drop table if exists terceiros;

create table usuarios(
	id 				int				not null	primary key 	auto_increment,
    nome			varchar(70)		not null,
    email			varchar(50)		not null,
    cpf				varchar(14)		not null,
    sexo			varchar(20) 	not null,
    celular			varchar(14)		not null,
    senha			varchar(50)		not null
);

create table funcionarios(
	id 				int 			not null 	primary key 	auto_increment,
	nome 			varchar(70) 	not null,
	email 			varchar(50) 	not null,
    celular			varchar(14)		not null,
	cpf 			varchar(14) 	not null,
	sexo 			varchar(20) 	not null,
	data_nasc 		date 			not null,
	endereco 		varchar(100) 	not null,
	cidade 			varchar(45) 	not null,
	estado 			varchar(2) 		not null,
	data_ingresso 	date 			not null,
	salario 		float(8,2)		not null
);


