CREATE SEQUENCE user_sequence;

CREATE TABLE app_user
(
    id       INT PRIMARY KEY,
    username VARCHAR(250) NOT NULL,
    password VARCHAR(250) NOT NULL,
    email    VARCHAR(250) DEFAULT NULL
);

CREATE TABLE password
(
    id        INT PRIMARY KEY,
    password  VARCHAR(250) NOT NULL,
    site_name VARCHAR(250) NOT NULL,
    site_url  VARCHAR(250) NOT NULL,
    user_id   INT          NOT NULL REFERENCES app_user (id)
        ON DELETE CASCADE ON UPDATE CASCADE
);
