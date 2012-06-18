
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
telefono_p int,
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
linea_co VARCHAR(100),
marca_co VARCHAR(100),
color_co VARCHAR(100),
modelo_co VARCHAR(100),
cojineria_co VARCHAR(100),
valor_co int);


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


