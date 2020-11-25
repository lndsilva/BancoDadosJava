# BancoDadosJava

create database estacionamento;

use estacionamento;

create table tbcarro(
placa char(7) not null,
cor varchar(20),
descricao varchar(100),
primary key(placa));

-- criar a tabela usuário
create table tbUsuario(
codUsu int not null auto_increment,
nomeUsu varchar(20),
senhaUsu varchar(20),
primary key(codUsu));

create table tbCliente(
codCli int not null auto_increment,
nomeCli varchar(100),
emailCli varchar(100),
telCli varchar(9),
cpfClli varchar(14),
primary key(codCli));
