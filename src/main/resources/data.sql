INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Ana Santos', 'anasantos@example.com', '44444444444');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Ana Santos', 'anasantos@email.com', '44444444445');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('João Silva', 'joao@example.com', '55555555555');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Maria Souza', 'maria@example.com', '66666666666');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Lucas Oliveira', 'lucas@example.com', '77777777777');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Julia Pereira', 'julia@example.com', '88888888888');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Pedro Rodrigues', 'pedro@example.com', '99999999999');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Sofia Almeida', 'sofia@example.com', '11111111111');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Matheus Lima', 'matheus@example.com', '22222222222');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Isabella Gonçalves', 'isabella@example.com', '33333333333');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Arthur Carvalho', 'arthur@example.com', '12345678901');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Lara Fernandes', 'lara@example.com', '23456789012');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Davi Ribeiro', 'davi@example.com', '34567890123');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Mariana Torres', 'mariana@example.com', '45678901234');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Thiago Santos', 'thiago@example.com', '56789012345');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Helena Silva', 'helena@example.com', '67890123456');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Enzo Souza', 'enzo@example.com', '78901234567');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Valentina Oliveira', 'valentina@example.com', '89012345678');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Benjamin Pereira', 'benjamin@example.com', '90123456789');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Laura Rodrigues', 'laura@example.com', '01234567890');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Gabriel Almeida', 'gabriel@example.com', '00000000001');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Manuela Lima', 'manuela@example.com', '00000000002');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Nicolas Gonçalves', 'nicolas@example.com', '00000000003');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Lorena Carvalho', 'lorena@example.com', '00000000004');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Rafaela Fernandes', 'rafaela@example.com', '00000000005');
INSERT INTO Cliente (nome_cliente, email, cpf) VALUES ('Gustavo Ribeiro', 'gustavo@example.com', '00000000006');

INSERT INTO Aluguel (id_locacao, data_vencimento, valor_pago, data_pagamento, obs) VALUES (1, '2023-11-10', 400, null, "observacao 1");
INSERT INTO Aluguel (id_locacao, data_vencimento, valor_pago, data_pagamento, obs) VALUES (2, '2023-11-11', 500, null, "observacao 2");
INSERT INTO Aluguel (id_locacao, data_vencimento, valor_pago, data_pagamento, obs) VALUES (3, '2023-11-12', 600, null, "observacao 3");
INSERT INTO Aluguel (id_locacao, data_vencimento, valor_pago, data_pagamento, obs) VALUES (4, '2023-11-13', 700, null, "observacao 4");
INSERT INTO Aluguel (id_locacao, data_vencimento, valor_pago, data_pagamento, obs) VALUES (5, '2023-11-14', 800, null, "observacao 5");
INSERT INTO Aluguel (id_locacao, data_vencimento, valor_pago, data_pagamento, obs) VALUES (6, '2023-11-15', 900, null, "observacao 6");
INSERT INTO Aluguel (id_locacao, data_vencimento, valor_pago, data_pagamento, obs) VALUES (7, '2023-11-16', 1000, null, "observacao 7");
INSERT INTO Aluguel (id_locacao, data_vencimento, valor_pago, data_pagamento, obs) VALUES (8, '2023-11-17', 1100, null, "observacao 8");
INSERT INTO Aluguel (id_locacao, data_vencimento, valor_pago, data_pagamento, obs) VALUES (9, '2023-11-18', 1200, null, "observacao 9");
INSERT INTO Aluguel (id_locacao, data_vencimento, valor_pago, data_pagamento, obs) VALUES (10, '2023-11-19', 1300, null, "observacao 10");

INSERT INTO Imovel (tipo_imovel, endereco, bairro, cep, metragem, dormitorios, banheiros, suites, vagas_garagem, valor_aluguel_sugerido, obs) VALUES ('Casa', '123 Rua da Amostra', 'Bairro A', '12345678', 150.5, 3, 2, 1, 2, 2000.0, 'Casa com jardim espaçoso');
INSERT INTO Imovel (tipo_imovel, endereco, bairro, cep, metragem, dormitorios, banheiros, suites, vagas_garagem, valor_aluguel_sugerido, obs) VALUES ('Apartamento', '456 Avenida da Amostra', 'Bairro B', '54321876', 80.0, 2, 1, 0, 1, 1200.0, 'Apartamento mobiliado');
INSERT INTO Imovel (tipo_imovel, endereco, bairro, cep, metragem, dormitorios, banheiros, suites, vagas_garagem, valor_aluguel_sugerido, obs) VALUES ('Casa', '789 Rua da Amostra', 'Bairro C', '98765432', 200.0, 4, 3, 2, 2, 2500.0, 'Ampla casa com quintal');
INSERT INTO Imovel (tipo_imovel, endereco, bairro, cep, metragem, dormitorios, banheiros, suites, vagas_garagem, valor_aluguel_sugerido, obs) VALUES ('Apartamento', '101 Avenida Exemplo', 'Bairro D', '10101010', 65.5, 1, 1, 0, 1, 900.0, 'Ótima localização');
INSERT INTO Imovel (tipo_imovel, endereco, bairro, cep, metragem, dormitorios, banheiros, suites, vagas_garagem, valor_aluguel_sugerido, obs) VALUES ('Casa', '222 Rua da Demonstração', 'Bairro E', '22222222', 180.0, 3, 2, 1, 2, 1800.0, 'Piscina e área de churrasco');
INSERT INTO Imovel (tipo_imovel, endereco, bairro, cep, metragem, dormitorios, banheiros, suites, vagas_garagem, valor_aluguel_sugerido, obs) VALUES ('Apartamento', '123 Rua das Flores', 'Centro', '12345678', 85.5, 2, 1, 1, 1, 1500.0, 'Bem localizado no centro da cidade');
INSERT INTO Imovel (tipo_imovel, endereco, bairro, cep, metragem, dormitorios, banheiros, suites, vagas_garagem, valor_aluguel_sugerido, obs) VALUES ('Casa', '456 Avenida dos Sonhos', 'Bairro F', '54321000', 210.0, 4, 3, 2, 2, 2800.0, 'Ampla casa com quintal e piscina');
INSERT INTO Imovel (tipo_imovel, endereco, bairro, cep, metragem, dormitorios, banheiros, suites, vagas_garagem, valor_aluguel_sugerido, obs) VALUES ('Apartamento', '789 Rua da Esperança', 'Bairro G', '98765432', 95.5, 2, 2, 1, 1, 1700.0, 'Vista panorâmica da cidade');
INSERT INTO Imovel (tipo_imovel, endereco, bairro, cep, metragem, dormitorios, banheiros, suites, vagas_garagem, valor_aluguel_sugerido, obs) VALUES ('Casa', '101 Avenida das Árvores', 'Bairro H', '10102020', 180.5, 3, 2, 1, 2, 2200.0, 'Lindo jardim e espaço para churrasco');
INSERT INTO Imovel (tipo_imovel, endereco, bairro, cep, metragem, dormitorios, banheiros, suites, vagas_garagem, valor_aluguel_sugerido, obs) VALUES ('Apartamento', '222 Rua dos Pássaros', 'Bairro I', '22223333', 75.0, 2, 1, 0, 1, 1300.0, 'Próximo a parques e escolas');

INSERT INTO Locacao (id_inquilino, valor_aluguel, percentual_multa, dia_vencimento, data_inicio, data_fim, ativo, obs) VALUES (1, 1500.0, 0.03, 5, '2023-10-01', '2024-09-30', true, 'Contrato de locação em andamento');

INSERT INTO Locacao (id_inquilino, valor_aluguel, percentual_multa, dia_vencimento, data_inicio, data_fim, ativo, obs) VALUES (2, 1200.0, 0.02, 10, '2023-11-01', '2024-10-31', true, 'Primeira locação de um novo inquilino');

INSERT INTO Locacao (id_inquilino, valor_aluguel, percentual_multa, dia_vencimento, data_inicio, data_fim, ativo, obs) VALUES (3, 1800.0, 0.03, 15, '2023-09-15', '2024-09-14', true, 'Locação em um imóvel maior');

INSERT INTO Locacao (id_inquilino, valor_aluguel, percentual_multa, dia_vencimento, data_inicio, data_fim, ativo, obs) VALUES (4, 950.0, 0.02, 20, '2023-08-01', '2024-07-31', true, 'Início de contrato com desconto no aluguel');

INSERT INTO Locacao (id_inquilino, valor_aluguel, percentual_multa, dia_vencimento, data_inicio, data_fim, ativo, obs) VALUES (5, 2100.0, 0.03, 1, '2023-10-15', '2024-10-14', true, 'Locação em área residencial tranquila');

INSERT INTO Locacao (id_inquilino, valor_aluguel, percentual_multa, dia_vencimento, data_inicio, data_fim, ativo, obs) VALUES (6, 1350.0, 0.02, 5, '2023-12-01', '2024-11-30', false, 'Início de contrato anual renovável');

INSERT INTO Locacao (id_inquilino, valor_aluguel, percentual_multa, dia_vencimento, data_inicio, data_fim, ativo, obs) VALUES (7, 950.0, 0.02, 10, '2023-11-15', '2024-11-14', false, 'Locação temporária durante a temporada de férias');

INSERT INTO Locacao (id_inquilino, valor_aluguel, percentual_multa, dia_vencimento, data_inicio, data_fim, ativo, obs) VALUES (8, 1750.0, 0.03, 25, '2023-09-01', '2024-08-31', false, 'Locação em prédio com serviços de concierge');

INSERT INTO Locacao (id_inquilino, valor_aluguel, percentual_multa, dia_vencimento, data_inicio, data_fim, ativo, obs) VALUES (9, 1450.0, 0.02, 5, '2023-10-01', '2024-09-30', false, 'Locação em um bairro histórico');