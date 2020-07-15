create table estados (
id int UNSIGNED NOT null AUTO_INCREMENT,
nome VARCHAR(45) NOT NULL,
sigla VARCHAR(2) NOT NULL,
regiao enum('norte', 'nordeste', 'centro-oeste', 'sudeste', 'sul') not NULL,
populacao DECIMAL(5,2) NOT NULL,
PRIMARY KEY (id),
unique KEY (nome),
UNIQUE KEY (sigla)
);