CREATE database dynamicmenu;

use dynamicmenu;

CREATE TABLE menu (


    idmenu INT NOT NULL,
    nama VARCHAR(255) NOT NULL,
    link VARCHAR(255) NOT NULL,
    parentid INT,

    CONSTRAINT pk_idmenu PRIMARY KEY (idmenu)

);

INSERT INTO menu (idmenu, nama, link) VALUES (1, 'Transaksi', '/data/transaksi');
INSERT INTO menu (idmenu, nama, link) VALUES (2, 'Barang', '/data/barang');
INSERT INTO menu (idmenu, nama, link) VALUES (3, 'Kategori', '#');
INSERT INTO menu (idmenu, nama, link) VALUES (9, 'About', '#');
INSERT INTO menu (idmenu, nama, link) VALUES (3, 'Contact', '#');



INSERT INTO menu (idmenu, nama, link, parentid) VALUES (4, 'kategori.1', '/data/kategori/kategori1', 3);
INSERT INTO menu (idmenu, nama, link, parentid) VALUES (5, 'Kategori.2', '/data/kategori/kategori2', 3);
INSERT INTO menu (idmenu, nama, link, parentid) VALUES (6, 'Kategori.3', '/data/kategori/kategori3', 3);
INSERT INTO menu (idmenu, nama, link, parentid) VALUES (7, 'Kategori.4', '/data/kategori/kategori4', 3);
INSERT INTO menu (idmenu, nama, link, parentid) VALUES (8, 'Kategori.5', '/data/kategori/kategori5', 3);
