DROP DATABASE IF EXISTS kadummvc;
CREATE DATABASE kadummvc;
USE kadummvc;
CREATE TABLE cliente (
  id int(10) AUTO_INCREMENT PRIMARY KEY,
  nombre varchar(50) DEFAULT NULL,
  apellido varchar(50) DEFAULT NULL,
  nif varchar(10) DEFAULT NULL
);

#BORRAR CLIENTE POR ID
DELIMITER $$
DROP PROCEDURE IF EXISTS borrarCliente$$
CREATE PROCEDURE borrarCliente(id INT(10))
BEGIN
DELETE FROM cliente WHERE cliente.id = id;
END
$$

#OBTENER EL NOMBRE, APELLIDO Y NIF DE UN CLIENTE
DELIMITER $$
DROP PROCEDURE IF EXISTS getCliente$$
CREATE PROCEDURE getCliente(id INT(10))
BEGIN
SELECT nombre, apellido, nif 
FROM cliente 
WHERE cliente.id= id;
END
$$

#OBTENER EL ID, NOMBRE Y NIF DE TODOS LOS CLIENTES
DELIMITER $$
DROP PROCEDURE IF EXISTS getClientes$$
CREATE PROCEDURE getClientes()
BEGIN
SELECT id, nombre, nif
FROM cliente
ORDER BY nombre;
END
$$

#INSERTAR UN CLIENTE
DELIMITER $$
DROP PROCEDURE IF EXISTS insertarCliente$$
CREATE PROCEDURE insertarCliente(nombre VARCHAR(50), apellido VARCHAR(50), nif VARCHAR(10))
BEGIN
INSERT INTO cliente VALUES(NULL,nombre,apellido,nif);
END
$$

#MODIFICAR CLIENTE POR ID
DELIMITER $$
DROP PROCEDURE IF EXISTS modificarCliente$$
CREATE PROCEDURE modificarCliente(id INT(10), nombre VARCHAR(50), apellido VARCHAR(50), nif VARCHAR(10))
BEGIN
UPDATE cliente
SET cliente.nombre = nombre, cliente.apellido=apellido, cliente.nif=nif WHERE cliente.id=id;
END
$$
DELIMITER ;
INSERT INTO cliente (id, nombre, apellido,nif) VALUES 
			(NULL, "Alberto", "Carrera Mart�n", "11111111A"),
			(NULL, "Bel�n", "Carrera Saus�n", "22222222B"),
		    (NULL, "Mario", "Carrera Bail�n", "33333333C"),
		    (NULL, "Raquel", "Carrera Bail�n", "44444444D"),
			(NULL, "To�o", "M�riz Piedrafita", "55555555E"),
		    (NULL, "Txavi", "Escart�n Nasarre","66666666F"),
		    (NULL, "Fernando", "Mart�nez P�rez", "77777777G"),
		    (NULL, "Nacho", "Garc�s De Gregorio", "88888888H"),
		    (NULL, "Lorenzo", "Blasco Gonz�lez", "99999999I");
