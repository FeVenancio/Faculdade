-- DML 
	-- select (inner join)
	-- insert
	-- update
	-- delete
	-- Algumas funções para trabalhar com string
	-- Algumas funções para trabalhar com Data

-- select (join)
select count(*) clientes
from Cliente

select count(*) pedidos
from Pedido

select count(*) total
from Cliente, Pedido

-- Quando o Edson realizou os seus pedidos?
select data
from Cliente, Pedido
where Cliente.cod_cliente = Pedido.cod_cliente
and nome like 'Edson%'

select data
from Cliente inner join
Pedido on Cliente.cod_cliente = Pedido.cod_cliente
where nome like 'Edson%'

-- Quais os vendedores que atenderam o Edson?
select distinct v.nome
from Cliente c inner join 
Pedido p on c.cod_cliente = p.cod_cliente inner join
Vendedor v on v.cod_vendedor = p.cod_vendedor
where c.nome like 'Edson%'

select  v.nome
from Cliente c inner join 
Pedido p on c.cod_cliente = p.cod_cliente inner join
Vendedor v on v.cod_vendedor = p.cod_vendedor
where c.nome like 'Edson%'
group by v.nome

-- Quanto que o Edson gastou?
select c.nome, sum(it.quantidade * it.valor) total
from Cliente c inner join
Pedido p on c.cod_cliente = p.cod_cliente inner join
Item_Pedido it on it.cod_pedido = p.cod_pedido
where c.nome like 'Edson%'
group by c.nome

-- insert
select * from Condicao_Pagamento

-- insert into <<nomeTabela>> values (<<valores>>)
insert into Condicao_Pagamento values 
( 'Pix parcelado', 'Parcela até 12x')

insert into Condicao_Pagamento values 
( 'Pix a prazo', null)

-- Insert into <<NomeTabela>>(<<colunas>>) 
-- values(<<valores>>)
select * from Produto

insert into Produto (nome, cod_marca)
values ('Canetão', 1)

-- update
select * 
from Cliente

update Cliente set 
	email = 'edson.feitosa@facens.br'
where cod_cliente = 1

update Cliente set
	nome = 'Victor Gabriel Scudeler',
	endereco = 'Rua teste',
	cidade = 'Sorocaba'
where cod_cliente = 5

-- Delete
 --  delete <<tabela>> <<condições>>
select * 
from Condicao_Pagamento

delete Condicao_Pagamento 
where cod_condicao_pagto = 1006

select *
-- delete
from Condicao_Pagamento
where nome like 'pix%'
and descricao = 'Parcela até 12x'

delete from Item_Pedido
delete from Pedido
select * from Cliente

-- Algumas funções para trabalhar com string
-- charindex- pergar o índice do caracter 
select nome, charindex(' ', nome)
from Cliente

-- substring (pegar um pedaço do string)
		select nome, substring(nome,0,CHARINDEX(' ', nome)) primeiroNome,
	   REVERSE(nome) nomeInvertido, 
	   REVERSE(substring(REVERSE(nome),0,CHARINDEX(' ', REVERSE(nome)))) ultimoNome,
	   substring(nome,0,CHARINDEX(' ', nome)) + '.' +
	   REVERSE(substring(REVERSE(nome),0,CHARINDEX(' ', REVERSE(nome)))) +
	   '@facens.br' emailInstitucional
		from Cliente


-- ltrim | rtrim | trim

--replace
select nome, REPLACE(nome,'martin','joão') novoNome 
from Cliente
where nome like 'edson%'


-- Lista INSERT, UPDATE, DELETE
-- 1-
	select *
	from Produto

	insert into Condicao_Pagamento (nome, descricao)
	values ('Dinheiro', 'Pagamento a vista')

	insert into Compra (data, cod_fornecedor, cod_condicao_pagto)
	values (getdate(), 14, 10)

	insert into Item_Compra (quantidade, valor, cod_compra, cod_produto)
	values (50, 15.70, 208, 128)

	insert into Marca (nome)
	values ('Board Master')

	insert into Fornecedor (cpf, nome, telefone)
	values ('222.333.444', 'Maria Joaquina', '(15)321-456')

	insert into Produto (nome)
	values ('lousa')

-- 2-

	select * 
	from Item_Pedido
	where cod_pedido in (3, 9, 109)

	delete Item_Pedido
	from Item_Pedido item inner join Pedido p on item.cod_pedido = p.cod_pedido
	where p.cod_pedido = 3 or p.cod_pedido = 9 or p.cod_pedido = 109

	delete Pedido
	from Cliente c inner join Pedido p on c.cod_cliente = p.cod_cliente
	where nome like 'Rafael Moreno%'

-- 3-
	select *
	from Produto
	
	select *
	from Item_Pedido

	update Item_Pedido set
		quantidade = 20
	where cod_pedido = 4 and (cod_produto = 3 or cod_produto = 9 or cod_produto = 21)

-- 4-

	update Fornecedor set
		telefone = '2344-8527'
	where nome like 'Joaquim Silva%'

	select nome, telefone
	from Fornecedor
	where nome like 'Joaquim Silva%'

-- 5-
	

	select *
	from Cliente

	alter table Cliente
	add numero varchar(15)

-- 6-


-- 7- SELECT
	
	select *
	from Item_Pedido
	where quantidade >= 5 and quantidade <= 10

	select nome, quantidade
	from Item_Pedido item inner join Produto p on item.cod_produto = p.cod_produto
	where p.nome = 'caneta' and (item.quantidade >= 5 and item.quantidade <= 10)

-- 8- 

	select *
	from Cliente

	select nome
	from Cliente
	where nome like 'R[^a]%'

-- 9-

	select *
	from Item_Compra
	where cod_compra = 1

	-- codigo item compra 1,2,6,7,8
	
	select *
	from Item_Compra
	where cod_item_compra in (1,2,6,7,8)

	select *
	from Produto 
	where cod_produto in (1,2,3,4)

	select *
	from Condicao_Pagamento

	select *
	from Compra
	where cod_fornecedor = 3 and cod_condicao_pagto = 2 

-- 10-

	select nome
	from Cliente
	where nome like '[^A-R]%'
