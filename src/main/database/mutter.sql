CREATE TABLE mutter(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    text VARCHAR(255) NOT NULL
);

INSERT INTO mutter (name, text) VALUES ('Tanaka Taro', "I'm off today.");
INSERT INTO mutter (name, text) VALUES ('Yamada Satoshi', "I'm jealous!");