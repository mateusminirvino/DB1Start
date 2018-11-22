INSERT INTO UF (NOME) VALUES ('AC'), ('AL'), ('AP'), ('AM'), ('BA'), ('CE'), ('DF'), ('ES'), ('GO'), ('MT'), ('MS'), ('PA'), ('PB'), ('PR'), ('PE'), ('PI'), ('RJ'), ('RN'), ('RS'), ('RO'), ('RR'), ('SC'), ('SP'), ('SE'), ('TO')

DELETE FROM UF WHERE ID = 1

DELETE FROM cidade1 WHERE ID = 1

SELECT * FROM UF

SELECT * FROM CIDADE1

INSERT INTO CIDADE1 (NOME, UF_ID) 
VALUES ('Chapecó', 26),
('Blumenau', 26),
('Joinville', 26)

INSERT INTO CIDADE1 (NOME, UF_ID) 
VALUES ('Curitiba', 18),
('Maringá', 18),
('Lunardeli', 18),
('Apucarana', 18),
('Santa Fé', 18),
('São Miguel do Iguaçu', 18),
('Arapongas', 18),
('Ponta Grossa', 18),
('Jandaia do Sul', 18)

INSERT INTO CIDADE1 (NOME, UF_ID) 
VALUES ('Ribeirão Preto', 27)

delete from uf where id not in (26,18,27)

insert into cidade1 (nome, uf_id)
values ('São Paulo', 27),
('Guarulhos', 27),
('Jundiaí', 27),
('Santo André', 27),
('Campinas', 27)

update cidade1 set nome = 'Lunardelli' where id = 7

update cidade1 set nome = 'Jandaia' where id = 13;

update cidade1 set nome = 'Cidade Canção' where id = 6

Select cidade1.nome, uf.nome from cidade1 inner join uf on uf.id = cidade1.uf_id order by uf.nome, cidade1.nome

select count(cidade1.id) as 'Quantidade de cidades', uf.nome from cidade1 inner join uf on uf.id = cidade1.uf_id group by uf.nome

select * from pessoa

select * from endereco

insert into pessoa (nome, documento)
values ('Mateus', 05101467910),
('José', 12345678910)

insert into endereco (tipoLogradouro, logradouro, numero, complemento, cep, tipo, cidade_id, pessoa_id)
values ('Rua', 'Brasil', '255', 'Apto 02', '88888000', 'residencial', 15, 1),
 ('Rua', 'Mauá', '555', 'Apto 01', '55555000', 'comercial', 15, 1),
 ('Rua', 'Paraná', '123', 'Apto 32', '77777000', 'residencial', 16, 2),
 ('Rua', 'Japão', '321', 'Apto 33', '99999000', 'comercial', 16, 2)