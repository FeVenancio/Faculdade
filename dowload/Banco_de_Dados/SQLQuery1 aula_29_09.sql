create database Consultorio_Medico

create table Medico 
(
	CRM int primary key not null,
	Telefone varchar(20) not null,
	CPF varchar(20) not null,
	Email varchar(50) not null,
	RG varchar(20) not null,
	Nome varchar(200) not null
)

create table Especialidade
(
	cod_especialidade int identity(1,1) primary key,
	Nome varchar(200) not null
)

create table Medico_Especialidade
(
	CRM int foreign key references Medico(CRM) not null,
	cod_especialista int foreign key references Especialidade(cod_especialidade) not null,
	primary key (CRM, cod_especialista)
)

create table Paciente
(
	cod_paciente int identity(1,1) primary key,
	Nome varchar(200) not null,
	Telefone varchar(20),
	CPF varchar(20) not null,
	RG varchar(20) not null
)

create table Exame 
(
	cod_exame int identity(1,1) primary key,
	cod_paciente int foreign key references Paciente(cod_paciente),
	Nome varchar(200) not null,
	Resultado varchar(500) not null,
)

create table Consulta
(
	cod_consulta int identity(1,1) primary key,
	cod_paciente int references Paciente(cod_paciente),
	CRM int references Medico(CRM),
	data_hora datetime not null,
)

