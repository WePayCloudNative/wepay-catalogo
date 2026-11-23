-- Las imágenes se sirven desde el front (public/img/productos)
INSERT INTO products (id, name, description, price, categoria, imagen_url, precio_anterior) VALUES
    (1, 'Teclado mecánico gamer RedBack', 'Switches ópticos, iluminación RGB, key rollover 100%', 79990, 'Periféricos', '/img/productos/teclado.jpg', 99990),
    (2, 'Mouse gamer Hydra X', 'Sensor 16000 DPI, peso ajustable, 6 botones programables', 49990, 'Periféricos', '/img/productos/mouse.jpg', NULL),
    (3, 'Auriculares GameSound Pro', 'Sonido envolvente 7.1, micrófono con cancelación de ruido', 89990, 'Audio', '/img/productos/auriculares.jpg', 109990),
    (4, 'Monitor 27" 144Hz IPS', '144Hz, 1ms, FreeSync, 27 pulgadas', 249990, 'Monitores', '/img/productos/monitor.jpg', NULL),
    (5, 'Silla gamer TitanComfort', 'Ergonómica, soporte lumbar, reposabrazos 4D', 199990, 'Sillas', '/img/productos/silla.jpg', 249990),
    (6, 'Alfombrilla XL Pro', 'Superficie extendida para teclado y mouse, base antideslizante', 29990, 'Periféricos', '/img/productos/alfombrilla.jpg', NULL),
    (7, 'Microfono StudioCast', 'Micrófono USB para streaming y comunicación', 69990, 'Streaming', '/img/productos/microfono.jpg', NULL),
    (8, 'Webcam 1080p StreamCam', '1080p30, autoexposición, ideal para streamers', 59990, 'Streaming', '/img/productos/webcam.jpg', 69990);

INSERT INTO pedido_detalle (id, product_id, quantity) VALUES
    (1, 1, 2);