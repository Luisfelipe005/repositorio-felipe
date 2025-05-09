UPDATE pacientes SET ativo = 1 WHERE ativo IS NULL;
ALTER TABLE pacientes MODIFY ativo TINYINT NOT NULL;


