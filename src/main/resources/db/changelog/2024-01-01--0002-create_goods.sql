CREATE TABLE IF NOT EXISTS goods
(
    id               uuid         NOT NULL,
    name             varchar(200) NOT NULL,
    description      text         NOT NULL,
    location         varchar(200) NOT NULL,
    price            numeric      NOT NULL,
    user_id          uuid         NOT NULL,
    CONSTRAINT pk_goods PRIMARY KEY (id),
    CONSTRAINT fk_goods_users_id_to_user FOREIGN KEY (user_id) REFERENCES users(id)
);