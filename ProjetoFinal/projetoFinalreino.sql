create database projetoFinal;

create table tb_reino (
	id_reino int primary key auto_increment,
    nome_reino varchar(50)
);

create table tb_filo(
	id_filo int primary key auto_increment,
    nome_filo varchar (50),
    id_reino int,
    constraint fk_id_reino foreign key (id_reino) references tb_reino(id_reino) on delete restrict
);

create table tb_classe(
	id_classe int primary key auto_increment,
    nome_classe varchar (50),
    id_filo int,
    constraint fk_id_filo foreign key (id_filo) references tb_filo(id_filo) on delete restrict
);

create table tb_ordem(
	id_ordem int primary key auto_increment,
    nome_ordem varchar(50), 
    id_classe int,
    constraint fk_id_classe foreign key(id_classe) references tb_classe(id_classe) on delete restrict
);

-- drop table tb_ordem

select * from tb_ordem;

create table tb_familia(
	id_familia int primary key auto_increment,
    nome_familia varchar(100),
    comprimento_familia float,
    alimentacao_familia varchar (50),
    antena_familia varchar (50),
    aparelhobucal_familia varchar(50),
    asa_familia varchar(50),
    id_ordem int,
    constraint fk_id_ordem foreign key (id_ordem) references tb_ordem (id_ordem) on delete restrict
);



 drop table tb_familia;

select * from tb_familia;