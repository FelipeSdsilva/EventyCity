INSERT INTO tb_participant (name, email) VALUES ('José Silva', 'jose@gmail.com');
INSERT INTO tb_participant (name, email) VALUES ('Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participant (name, email) VALUES ('Maria do Rosário', 'maria@gmail.com');
INSERT INTO tb_participant (name, email) VALUES ('Teresa Silva', 'teresa@gmail.com');

INSERT INTO tb_category(description) VALUES ('Curso');
INSERT INTO tb_category(description) VALUES ('Oficina');

INSERT INTO tb_activity (name, description, price, id_category) VALUES ('Curso de HTML','Aprenda HTML de forma prática', 80.00, 1);
INSERT INTO tb_activity (name, description, price, id_category) VALUES ('Oficina de Github','Controle de versões de seus projetos', 50.00, 2);

INSERT INTO tb_bloc (begin, ending, id_activity) VALUES (TIMESTAMP WITH TIME ZONE '2017-09-25T08:00:00Z',TIMESTAMP WITH TIME ZONE '2017-09-25T11:00:00Z', 1);
INSERT INTO tb_bloc (begin, ending, id_activity) VALUES (TIMESTAMP WITH TIME ZONE '2017-09-25T14:00:00Z',TIMESTAMP WITH TIME ZONE '2017-09-25T18:00:00Z', 2);
INSERT INTO tb_bloc (begin, ending, id_activity) VALUES (TIMESTAMP WITH TIME ZONE '2017-09-26T08:00:00Z',TIMESTAMP WITH TIME ZONE '2017-09-26T11:00:00Z', 2);

INSERT INTO tb_participant_activity (id_participant, id_activity) VALUES (1,1);
INSERT INTO tb_participant_activity (id_participant, id_activity) VALUES (1,2);
INSERT INTO tb_participant_activity (id_participant, id_activity) VALUES (2,1);
INSERT INTO tb_participant_activity (id_participant, id_activity) VALUES (3,1);
INSERT INTO tb_participant_activity (id_participant, id_activity) VALUES (3,2);
INSERT INTO tb_participant_activity (id_participant, id_activity) VALUES (4,2);
