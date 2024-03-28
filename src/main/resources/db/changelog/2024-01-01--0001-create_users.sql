CREATE TABLE IF NOT EXISTS users
(
    id               uuid        NOT NULL,
    username         varchar(50) NOT NULL,
    password         text        NOT NULL,
    contact_phone    varchar(15) NOT NULL,
    firstname       varchar(50) NOT NULL,
    lastname        varchar(50),
    email            varchar(50),
    constraint pk_users PRIMARY KEY (id)
);