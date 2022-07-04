drop table item_produto;
drop table materia_prima;
drop table categoria;
drop table produto;
create table produto 
(
    cod_produto integer,
    cod_categoria integer,
    produto varchar(255),
    constraint produto_pk primary key (cod_produto),
    constraint produto_uq unique (produto)
);
create table categoria
( 
    cod_categoria integer,
    categoria varchar(255),
    constraint categoria_pk primary key (cod_categoria),
    constraint categoria_uq unique (categoria),
    constraint categoria_ck1 check (categoria in ('DOCE','BEBIDA','CONGELADO'))
);
create table materia_prima
(
    cod_materia_prima integer,
    materia_prima varchar(255),
    constraint materia_prima_pk primary key (cod_materia_prima),
    constraint materia_prima_uq unique (materia_prima)
);
create table item_produto
(
    cod_produto integer,
    cod_materia_prima integer,
    quantidade integer,
    constraint item_produto_pk primary key (cod_produto, cod_materia_prima),
    constraint item_produto_ck1 check (quantidade is not null)
);
alter table produto 
add constraint produto_fk1 foreign key (cod_categoria) references categoria(cod_categoria);
alter table item_produto
add constraint produto_fk1 foreign key (cod_produto) references produto(cod_produto);
alter table item_produto
add constraint produto_fk2 foreign key (cod_materia_prima) references materia_prima(cod_materia_prima);
--// carrega categorias
insert into categoria values (1, 'BEBIDA');
insert into categoria values (2, 'DOCE');
insert into categoria values (3, 'CONGELADO');
insert into categoria values (4, 'SALGADO');   --// deve violar a constraint
insert into categoria values (5, 'DOCE');      --// deve violar a constraint de unique
--// carrega produtos
insert into produto values (1,1,'TONICA');
insert into produto values (2,1,'FANTA LARANJA');
insert into produto values (3,1,'FANTA UVA');
insert into produto values (4,1,'COCA COLA');
insert into produto values (5,2,'DOCE DE ABORA');
insert into produto values (6,2,'CHOCOLATE');
insert into produto values (7,3,'COXINHA');
insert into produto values (8,3,'HAMBURGER');
insert into produto values (9,8,'CAMARÃO');    --// deve violar a constraint de fk
insert into produto values (1,1,'CAMARÃO');    --// deve violar a constraint de primary
insert into produto values (10,1,'TONICA');    --// deve violar a constraint de unique
--// carrega mateira prima
insert into materia_prima values(1, 'GÁS');
insert into materia_prima values(2, 'LARANJA');
insert into materia_prima values(3, 'ABORA');
insert into materia_prima values(4, 'CARNE MOIDA');
insert into materia_prima values(5, 'UVA');
--// carrega item produto
insert into item_produto values(1,1,5);
insert into item_produto values(2,1,3);
insert into item_produto values(2,2,5);
insert into item_produto values(8,4,500);
insert into item_produto values(3,5,100);
--//
--//
--//lista registros de cada uma das tabelas
select * from produto;
select * from categoria;
select * from item_produto;
select * from materia_prima;
--//
--//
--// lista todos os registros relacionados
select * 
from categoria c
left join produto p
on c.cod_categoria = p.cod_categoria
left join item_produto ip
on p.cod_produto = ip.cod_produto
left join materia_prima mp
on ip.cod_materia_prima = mp.cod_materia_prima


