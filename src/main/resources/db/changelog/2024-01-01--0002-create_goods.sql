CREATE TABLE IF NOT EXISTS goods
(
    id          uuid        NOT NULL,
    productname varchar(80) NOT NULL,
    description text        NOT NULL,
    location    text        NOT NULL,
    price       int         NOT NULL,
    user_id     uuid         NOT NULL PRIMARY KEY,
    constraint pk_goods FOREIGN KEY (user_id) REFERENCES users (user_id)
);