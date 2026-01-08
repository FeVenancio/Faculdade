-- SQL - Struted Query Language -- Linguagem de Consulta Estruturada
-- DDL - Linguagem de Definição de Dados
	-- Create | Drop | Alter
-- DML - Linguagem de Mnaipulção de Dados
	-- Select | Insert | Update | Delete
-- DCL - Linguagem de Controle de Dados
	-- Grant | Revoke
----------------------------------
-- Aula de Hoje - DDL - Database | Table

drop database transporte
go 
use transporte

create table Veiculo
(
	placa varchar(10) primary key,
	modelo varchar(150) not null,
	ano int not null,
	cor varchar(100) null
)
go

create table Motorista
(
	cod_motorista int identity(1,1) primary key,
	nome varchar(200) not null,
	email varchar(50) not null,
	telefone varchar(15),
	cnh varchar(150) not null
)
go

create table Passageiro
(
	cod_passageiro int identity(1,1) primary key,
	nome varchar(100) not null,
	rg	varchar(15) not null,
	email varchar(50),
	telefone varchar(15)
)
go

create table Carga
(
	cod_carga int identity(1,1) primary key,
	nome varchar(100) not null,
	quantidade int not null default(0)
)
go

create table Manutencao
(
	cod_manutencao int identity(1,1) primary key,
	nome varchar(500) not null,
	valor numeric(10,2) not null,
	placa varchar(10) not null references Veiculo(placa)
)
go

create table Viagem
(
	cod_viagem int identity(1,1) primary key,
	rua_destino varchar(500) not null,
	numero_destino varchar(500) not null,
	bairro_destino varchar(500) not null,
	estado_destino varchar(2) not null,
	rua_origem varchar(500) not null,
	numero_origem varchar(100) not null,
	bairro_origem varchar(500) not null,
	estado_origem varchar(2) not null, 
	valor numeric(10,2) not null,
	dataSaida datetime  not null,
	dataRetorno datetime not null,
	cod_motorista int not null,
	placa varchar(10) not null,
	foreign key(cod_motorista) references Motorista(cod_motorista),
	foreign key(placa) references Veiculo(placa)
)
go

create table Passageiro_Viagem
(
	cod_passageiro int not null 
		references Passageiro(cod_passageiro),
	cod_viajem int not null
		references Viagem(cod_viagem),
	primary key (cod_passageiro, cod_viajem)
)
go

create table Carga_Viagem
(
	cod_carga int not null
		references Carga(cod_carga),
	cod_viagem int not null
		references Viagem(cod_viagem),
	primary key(cod_carga, cod_viagem),
	quantidade int
)