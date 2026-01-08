-- DML
	-- select (join)
	-- insert
	-- update
	-- delete
	-- algumas funções para trabalhar com string
	-- algumas funções para trabalhar com data
	select count(*) total from Cliente, Pedido 

	select * from Cliente, Pedido where Cliente.cod_cliente = Pedido.cod_cliente

	-- Quando o Edson realizou os seus pedidos ?
	select data from Cliente, Pedido where Cliente.cod_cliente = Pedido.cod_cliente and nome like 'Edson%'

	-- Quais vendedores que atenderam o Edson ?
	select v.nome 
	from Cliente c inner join pedido p on c.cod_cliente = p.cod_cliente inner join Vendedor v 
	on v.cod_vendedor = p.cod_vendedor
	where c.nome like 'Edson%' 
	group by v.nome

	-- Quanto que o Edson gastou ?
	select c.nome, sum(it.quantidade * it.valor) total
	from Cliente c inner join
	Pedido p on c.cod_cliente = p.cod_cliente inner join
	Item_pedido it on it.cod_pedido = p.cod_pedido
	where c.nome like 'Edson%' 
	group by c.nome

	-- insert into <<nomeTabela>> values (<<valores>>)
	insert into Condicao_Pagamento values 
	('Pix parcelado', 'Parcela até 12x')

	insert into Condicao_Pagamento values 
	('Pix a prazo', null)

	-- Insert into <<nomeTabela>> (<<colunas>>) values (<<valores>>)

	select * from Produto

	insert into Produto (nome, cod_marca) 
	values ('Canetão', 1)

	-- update
	select *
	from Cliente
	
	update Cliente set 
	email = 'daniela@gmail.com'

	--replace
	select nome, REPLACE(nome, 'martin1' , 'joão') novoNome
	from Cliente
	where nome like 'Edson%'

	