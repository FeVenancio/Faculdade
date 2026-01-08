create database Sistema_Bancário
-- nomes: Felipe Venancio 251670, João Vitor 251684
create table Agencias 
(
	id_agencia int identity(1,1) primary key,
	nome_agencia varchar(500) not null
)
create table Clientes
(
	id_cliente int identity(1,1) primary key,
	nome varchar(300) not null,
	cpf varchar(20) not null,
	senha varchar(300) not null
)
create table Contas 
(
	id_conta int identity(1,1) primary key,
	id_agencia int foreign key references Agencias(id_agencia),
	numero varchar(20) not null, 
	data_contas date not null
)

create table Movimentos 
(
id_movimento int identity(1,1) primary key,
id_conta int foreign key references Contas (id_conta),
tipo varchar(10) not null, 
valor numeric(10,2), 
data_movimentos date not null,
descricao varchar(500)
)

create table Clientes_Contas
(
	id_cliente int foreign key references Clientes(id_cliente),
	id_conta int foreign key references Contas(id_conta),
)

create table Agencias_Contas
(
	id_agencia int references Agencias(id_agencia),
	id_conta int references Contas(id_conta)
)

create table Contas_Movimentos
(
	id_conta int references Contas(id_conta),
	id_movimentos int references Movimentos(id_movimento)
)