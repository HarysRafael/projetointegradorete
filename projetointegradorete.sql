create table tbl_funcionario(
id_funcionario int auto_increment primary key,
nome_funcionario varchar(60),
email_funcionario varchar(60),
telefone_funcionario varchar (20),
dataContrato_funcionario date
);
CREATE TABLE `tbl_cardapio` (
  `id_cardapio` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `nome_cardapio` varchar(20),
  `valor_cardapio` double ,
);
CREATE TABLE `tbl_cliente` (
  `id_cliente` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `nome_cliente` varchar(30),
  `email_cliente` varchar(60),
  `telefone_cliente` varchar(20),
  `rua_cliente` varchar(20),
  `bairro_cliente` varchar(20),
  `cidade_cliente` varchar(20),
  `datacadastro_cliente` varchar(20),
  ) 
