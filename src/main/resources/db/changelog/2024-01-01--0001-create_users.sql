CREATE TABLE IF NOT EXISTS users
(
    user_id  uuid        NOT NULL,
    username varchar(50) NOT NULL,
    password text        NOT NULL,
    constraint pk_users PRIMARY KEY (user_id)
);