CREATE  TABLE products (
	productId INT NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (productId),
	name VARCHAR(45) NULL,
	description VARCHAR(45) NULL,
	price DOUBLE NULL
);

INSERT INTO products (id, name, description, price)
VALUES (1, TT&T Cordless Phone, Excellent reception (300 feet), 50.99);

INSERT INTO products (id, name, description, price)
VALUES (2, Erson Color Laser, 30pps super printing speed, 223.99);

INSERT INTO products (id, name, description, price)
VALUES (3, HBPassword Generator, One time password generator, 9.99);

