CREATE TABLE IF NOT EXISTS student_group (
    id SERIAL PRIMARY KEY,
    name_group VARCHAR(64) NOT NULL
    );

CREATE TABLE IF NOT EXISTS student (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(64) NOT NULL,
    last_name VARCHAR(64) NOT NULL,
    patronymic VARCHAR(64) NOT NULL,
    id_group BIGINT NOT NULL REFERENCES student_group (id),
    status VARCHAR(64) NOT NULL
);

