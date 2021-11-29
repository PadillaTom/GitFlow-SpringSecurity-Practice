CREATE TABLE test_entity (
id int8 NOT NULL GENERATED ALWAYS AS IDENTITY,
email varchar(200)  NULL,
password varchar(200) NULL,
CONSTRAINT test_entity_pk PRIMARY KEY (id)
);