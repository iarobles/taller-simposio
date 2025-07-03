/* Tabla de usuarios */
CREATE TABLE USUARIOS(
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(30)    
);

INSERT INTO USUARIOS(nombre, email, password) VALUES
('Marge Simpson', 'marge@email.com', '1234'),
('Homero Simpson', 'homero@email.com', '1234');

/* Tabla de compras */
CREATE TABLE COMPRAS(
    id SERIAL PRIMARY KEY,
    id_usuario INTEGER,
    producto VARCHAR(100),  
    precio FLOAT,
    FOREIGN KEY(id_usuario) REFERENCES USUARIOS(id)
);

INSERT INTO COMPRAS(id_usuario, producto, precio) VALUES
(1, 'Caballete', 1730.50),
(1, 'Disco vinil Ringo Starr', 1500.50),
(2, 'TV', 20000.50),
(2, 'Six pack cerveza duff', 360),
(2, 'Bolsa papas', 500);