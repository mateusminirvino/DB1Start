INSERT INTO UF (NOME) VALUES ('AC'), ('AL'), ('AP'), ('AM'), ('BA'), ('CE'), ('DF'), ('ES'), ('GO'), ('MA'), ('MG'), ('MT'), ('MS'), ('PA'), ('PB'), ('PR'), ('PE'), ('PI'), ('RJ'), ('RN'), ('RS'), ('RO'), ('RR'), ('SC'), ('SP'), ('SE'), ('TO')

INSERT INTO UF (NOME) VALUES ('MA'), ('MG')

SET SQL_SAFE_UPDATES = 0

DELETE FROM UF WHERE ID = 1

DELETE FROM cidade1 WHERE ID = 3

SELECT * FROM UF 

SELECT * FROM CIDADE1

INSERT INTO CIDADE1 (NOME, UF_ID) 
VALUES ('Chapecó', 22),
('Blumenau', 22),
('Joinville', 22)

INSERT INTO CIDADE1 (NOME, UF_ID) 
VALUES ('Curitiba', 14),
('Maringá', 14),
('Lunardeli', 14),
('Apucarana', 14),
('Santa Fé', 14),
('São Miguel do Iguaçu', 14),
('Arapongas', 14),
('Ponta Grossa', 14),
('Jandaia do Sul', 14)

INSERT INTO CIDADE1 (NOME, UF_ID) 
VALUES ('Ribeirão Preto', 23)

delete from uf where id not in (22,14,23)

insert into cidade1 (nome, uf_id)
values ('São Paulo', 23),
('Guarulhos', 23),
('Jundiaí', 23),
('Santo André', 23),
('Campinas', 23)

update cidade1 set nome = 'Lunardelli' where id = 9;

update cidade1 set nome = 'Jandaia' where id = 15;

update cidade1 set nome = 'Cidade Canção' where id = 8

Select cidade1.nome, uf.nome from cidade1 inner join uf on uf.id = cidade1.uf_id order by uf.nome, cidade1.nome

select count(cidade1.id) as 'Quantidade de cidades', uf.nome from cidade1 inner join uf on uf.id = cidade1.uf_id group by uf.nome

select * from pessoa

select * from endereco

insert into pessoa (nome, documento)
values ('Mateus', 05101467910),
('José', 12345678910)

insert into endereco (tipoLogradouro, logradouro, numero, complemento, cep, tipo, cidade_id, pessoa_id)
values ('Rua', 'Brasil', '255', 'Apto 02', '88888000', 'residencial', 17, 1),
 ('Rua', 'Mauá', '555', 'Apto 01', '55555000', 'comercial', 17, 1),
 ('Rua', 'Paraná', '123', 'Apto 32', '77777000', 'residencial', 16, 2),
 ('Rua', 'Japão', '321', 'Apto 33', '99999000', 'comercial', 16, 2)
               
insert into pessoa (nome, documento)
values ('Gabriele', '111.111.111-11'),
('Maria', '222.222.222-22')
               
insert into endereco (tipoLogradouro, logradouro, numero, complemento, cep, tipo, cidade_id, pessoa_id)
values ('Rua', 'Mandaguari', '333', 'Apto 33', '33333000', 'comercial', 4, 3),
 ('Rua', 'Duque de Caxias', '444', 'Apto 44', '44444000', 'comercial', 5, 4)

SELECT PESSOA.NOME, ENDERECO.tipologradouro, endereco.logradouro, endereco.numero, endereco.complemento, endereco.cep, endereco.tipo, CIDADE1.NOME, UF.NOME 
FROM PESSOA INNER JOIN ENDERECO on pessoa.id = endereco.pessoa_id
inner join cidade1 on endereco.cidade_id = cidade1.id
inner join uf on cidade1.uf_id = uf.id
order by pessoa.nome, uf.nome, cidade1.nome 

delete from pessoa 
	where id in 
		(select endereco.pessoa_id from endereco 
			where endereco.cidade_id = (select cidade1.id from cidade1 where cidade1.nome = 'Ribeirão Preto'))
            
            
update endereco set cep = '00000000' where endereco.tipo = 'residencial'

select * from recibo1

alter table recibo1 change prestador_fk cliente_fk int(11)

insert into pessoa (nome, documento)
values ('Fusca', '999.999.999-99'),
('Tamara', '123.456.789-10')

insert into endereco (tipoLogradouro, logradouro, numero, complemento, cep, tipo, cidade_id, pessoa_id)
values ('Rua', 'Arara', '12', 'Apto 12', '12121000', 'residencial', 7, 5),
 ('Rua', 'Tucano', '13', 'Apto 13', '13131000', 'residencial', 9, 6)
 
 alter table recibo1 drop column table1col

insert into recibo1 (valor, dataemissao, cliente_fk, emitente_fk)
value (10, 02/04/2018, 5, 1),
(20, 04/02/2018, 6,1) 
        
insert into recibo1 (valor, dataemissao, cliente_fk, emitente_fk)
value (30, 2018-10-23, 5, 2),
(40, 2018-10-23, 6,3)

select recibo1.id, 
	recibo1.dataemissao, 
	recibo1.valor, 
	pessoa.nome as 'Nome do Cliente', 
	uf.nome as 'Estado do Cliente', 
	pessoa.nome as 'Nome do Emitente',
    uf.nome as 'Estado do Emitente' 
from recibo1 inner join pessoa on (recibo1.cliente_fk = pessoa.id and recibo1.emitente_fk = pessoa.id)
			inner join endereco on (pessoa.id = endereco.pessoa_id)
            inner join cidade1 on (endereco.cidade_id = cidade1.id)
