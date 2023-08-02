CREATE TABLE IF NOT EXISTS COURSES(
    id int NOT NULL,
    name varchar(100) NOT NULL,
    category varchar(20) NOT NULL,
    rating int NOT NULL,
    description varchar(1000) NOT NULL,
    PRIMARY KEY (id)
);

--manera de crear una secuencia en h2
CREATE SEQUENCE IF NOT EXISTS my_sequence START WITH 5 INCREMENT BY 1;