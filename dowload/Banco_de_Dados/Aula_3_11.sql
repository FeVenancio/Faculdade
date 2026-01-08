-- quais os pedidos feitos pelo Edson com
-- condição de pagamento dinheiro ?

select * 
from vw_pedidos
where nomeCliente like 'Edson%'
and condicaoPagto = 'Dinheiro'
and nomeVendedor = 'joãozinho'

-- Quanto cada cliente gastou por pedido ?

select p.nomeCliente, it.cod_pedido, SUM(it.quantidade * it.valor)
from vw_pedidos p inner join
	Item_Pedido it on p.cod_pedido = it.cod_pedido
group by p.nomeCliente, it.cod_pedido