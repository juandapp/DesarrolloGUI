
DROP TABLE persona CASCADE;
DROP TABLE empleado CASCADE;
DROP TABLE cliente CASCADE;
DROP TABLE vehiculo CASCADE;
DROP TABLE articulo CASCADE;
DROP TABLE ordenes CASCADE;
DROP TABLE c_compra_v CASCADE;
DROP TABLE cotizacion CASCADE;

--TABLAS
CREATE TABLE persona (
id_p int PRIMARY KEY,
nombre_p VARCHAR(100),
direccion_p VARCHAR(100),
telefono_p VARCHAR(100),
email_p VARCHAR(100),
genero_p VARCHAR(100));

CREATE TABLE empleado (
id_e int,
tipo_e VARCHAR(100),
contrasena_e VARCHAR(100),
FOREIGN KEY (id_e) REFERENCES persona(id_p),
PRIMARY KEY (id_e)
);

CREATE TABLE cliente(
id_c int,
FOREIGN KEY (id_c) REFERENCES persona(id_p),
PRIMARY KEY (id_c)
);


CREATE TABLE vehiculo(
numerochasis_v int,
linea_v VARCHAR(100),
marca_v VARCHAR(100),
color_v VARCHAR(100),
modelo_v VARCHAR(100),
cojineria_v VARCHAR(100),
disponible_v BOOLEAN,
PRIMARY KEY (numerochasis_v)
);

CREATE TABLE articulo(
codigo_a int,
nombre VARCHAR(100),
descripcion VARCHAR(300),
cantidad int,
PRIMARY KEY (codigo_a)
);


--RELACIONES
CREATE TABLE c_compra_v(
id_c int,
numerochasis_v int,
tipo_pago VARCHAR(50),
PRIMARY KEY (id_c,numerochasis_v),
FOREIGN KEY (id_c) REFERENCES cliente(id_c),
FOREIGN KEY (numerochasis_v) REFERENCES vehiculo(numerochasis_v)
);

CREATE TABLE cotizacion(
numerochasis_v int,
fecha DATE,
precio int,
PRIMARY KEY(numerochasis_v,fecha,precio),
FOREIGN KEY (numerochasis_v) REFERENCES vehiculo(numerochasis_v)
);


CREATE TABLE ordenes(
id_e int,
id_c int,
numerochasis_v int,
codigo_a int,
valor int,
fecha DATE,
tipo_orden VARCHAR(100),
descripcion VARCHAR(300),
PRIMARY KEY (id_c,id_e,numerochasis_v,codigo_a),
FOREIGN KEY (id_e) REFERENCES empleado(id_e),
FOREIGN KEY (id_c) REFERENCES cliente(id_c),
FOREIGN KEY (codigo_a) REFERENCES articulo(codigo_a),
FOREIGN KEY (numerochasis_v) REFERENCES vehiculo(numerochasis_v)
);

--Registros
--Gerente
INSERT INTO persona VALUES(12345,'Cristian Loaiza','Calle 8a #50-22','3328529','gerente@porschecolombia.com','Masculino');

INSERT INTO empleado VALUES(12345,'Gerente','admin');

--Jefe de Taller
INSERT INTO persona VALUES(23456,'Frank Calvache','Calle 5 #83-29','8895024','calvache@porschecolombia.com','Masculino');

INSERT INTO empleado VALUES(23456,'Jefe de Taller','23456');

--Vendedor
INSERT INTO persona VALUES(34567,'Elisha Dushku','Calle 13 #20-42','3319852','dushku@porschecolombia.com','Femenino');

INSERT INTO empleado VALUES(34567,'Vendedor','34567');


--Acesorios
INSERT  INTO articulo VALUES(250,'Motor 2.3l DISI Turbo','L3T con intercooler',1);

INSERT  INTO articulo VALUES(42536,'Cera Simoniz 1lt','Cera brillante despues de lavado',10);

INSERT  INTO articulo VALUES(241,'Suspension MacPherson','Independiente, brazo sencillo',4);

--Vehiculos

INSERT INTO vehiculo VALUES(24523656,'Laser','Ford','Plateado','2009','Normal','TRUE');

INSERT INTO vehiculo VALUES(52456331,'Aveo','Chevrolet','Rojo','2012','Normal','TRUE');

INSERT INTO vehiculo VALUES(78464236,'RX8','Mazda','Plateado','2012','Cuero','TRUE');

