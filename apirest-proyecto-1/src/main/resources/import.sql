insert into proveedores (nombre,nif,email,telefono,direccion)values ("Los Gomez", "12697A", "losgomez@gmail.com", 658741295, "calle maria,3");
insert into proveedores (nombre,nif,email,telefono,direccion)values ("Las Marquez", "12697B", "lasmarquez@gmail.com", 65874548, "calle juana,10");
insert into proveedores (nombre,nif,email,telefono,direccion)values ("Perez", "12697C", "perez@gmail.com", 658415295, "calle del rey,80");
insert into proveedores (nombre,nif,email,telefono,direccion)values ("mounstros s.a", "12697D", "mikewazowski@gmail.com", 658103295, "calle dinosaurio,6");
insert into proveedores (nombre,nif,email,telefono,direccion)values ("Delgado", "12697E", "delgado@gmail.com", 658778595, "calle mamajuana,7");

INSERT INTO productos(nombre,codigo_producto,tipo,precio,fecha_registro,cantidad) VALUES("Carne de Res",1020,"Guauyu","14$ kilo","2022-06-16",120);
INSERT INTO productos(nombre,codigo_producto,tipo,precio,fecha_registro,cantidad) VALUES("Carne de Pollo",1021,"Corrar","10$ kilo","2022-06-16",89);
INSERT INTO productos(nombre,codigo_producto,tipo,precio,fecha_registro,cantidad) VALUES("Carne Pescado",1022,"Oceano","19$ kilo","2022-06-16",110);
INSERT INTO productos(nombre,codigo_producto,tipo,precio,fecha_registro,cantidad) VALUES("Carne Masricos",1023,"Mediterraneo","24$ kilo","2022-06-16",95);
INSERT INTO productos(nombre,codigo_producto,tipo,precio,fecha_registro,cantidad) VALUES("Carne Porcino",1024,"Criadero","13$ kilo","2022-06-16",130);

INSERT INTO clientes(nombre, apellido,nif,email,telefono) VALUES("Grecia","Morillo",1234,"greciamorillo@gmail.com",664828627);
INSERT INTO clientes(nombre, apellido,nif,email,telefono) VALUES("jorge","Nava",412,"jorgenava@gmail.com",6688527);
INSERT INTO clientes(nombre, apellido,nif,email,telefono) VALUES("Pedro","Pérez",1234,"pedroperez@gmail.com",660007);
INSERT INTO clientes(nombre, apellido,nif,email,telefono) VALUES("Carlos","Gonzalez",123324,"carlosgonzalez@gmail.com",999828627);
INSERT INTO clientes(nombre, apellido,nif,email,telefono) VALUES("María","López",1238894,"marialopez@gmail.com",662238627);

INSERT INTO ventas(id_producto,id_cliente,total,fecha_venta) VALUES (1, 1, 20.0,"2022-5-10" );
INSERT INTO ventas(id_producto,id_cliente,total,fecha_venta) VALUES (2, 2, 100.0,"2022-6-25" );
INSERT INTO ventas(id_producto,id_cliente,total,fecha_venta) VALUES (3, 3, 50.0,"2022-4-9" );
INSERT INTO ventas(id_producto,id_cliente,total,fecha_venta) VALUES (4, 4, 25.0,"2022-3-9" );
INSERT INTO ventas(id_producto,id_cliente,total,fecha_venta) VALUES (5, 5, 5.0,"2022-1-20" );
