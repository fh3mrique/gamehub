INSERT INTO tb_platform (platform_name) VALUES ('PC');
INSERT INTO tb_platform (platform_name) VALUES ('PlayStation 4');
INSERT INTO tb_platform (platform_name) VALUES ('Xbox One');
INSERT INTO tb_platform (platform_name) VALUES ('Nintendo Switch');
INSERT INTO tb_platform (platform_name) VALUES ('PlayStation 5');
INSERT INTO tb_platform (platform_name) VALUES ('Xbox Series X|S');
INSERT INTO tb_platform (platform_name) VALUES ('Mobile');

INSERT INTO tb_genre (genre_name) VALUES ('Action');
INSERT INTO tb_genre (genre_name) VALUES ('Adventure');
INSERT INTO tb_genre (genre_name) VALUES ('RPG');
INSERT INTO tb_genre (genre_name) VALUES ('Shooter');
INSERT INTO tb_genre (genre_name) VALUES ('Horror');
INSERT INTO tb_genre (genre_name) VALUES ('Puzzle');
INSERT INTO tb_genre (genre_name) VALUES ('Simulation');

INSERT INTO tb_game (name, review, grade, release_date, art_url) VALUES ('The Legend of Zelda: Breath of the Wild', 'Revolutionized open-world gameplay.', 9.5, '2017-03-03T00:00:00Z', 'https://img.elo7.com.br/product/zoom/49495EB/quadro-decorativo-games-resident-evil-4-remake-games.jpg');
INSERT INTO tb_game (name, review, grade, release_date, art_url) VALUES ('The Witcher 3: Wild Hunt', 'Immersive story and expansive world.', 9.3, '2015-05-19T00:00:00Z', 'https://img.elo7.com.br/product/zoom/49495EB/quadro-decorativo-games-resident-evil-4-remake-games.jpg');
INSERT INTO tb_game (name, review, grade, release_date, art_url) VALUES ('Red Dead Redemption 2', 'Detailed open-world western adventure.', 9.7, '2018-10-26T00:00:00Z', 'https://img.elo7.com.br/product/zoom/49495EB/quadro-decorativo-games-resident-evil-4-remake-games.jpg');
INSERT INTO tb_game (name, review, grade, release_date, art_url) VALUES ('Dark Souls III', 'Challenging gameplay with deep lore.', 8.9, '2016-04-12T00:00:00Z', 'https://img.elo7.com.br/product/zoom/49495EB/quadro-decorativo-games-resident-evil-4-remake-games.jpg');
INSERT INTO tb_game (name, review, grade, release_date, art_url) VALUES ('Persona 5', 'Compelling story with stylish visuals.', 9.2, '2017-09-15T00:00:00Z', 'https://img.elo7.com.br/product/zoom/49495EB/quadro-decorativo-games-resident-evil-4-remake-games.jpg');

-- The Legend of Zelda: Breath of the Wild (id = 1)
INSERT INTO game_genre (game_id, genre_id) VALUES (1, 1);
INSERT INTO game_genre (game_id, genre_id) VALUES (1, 2);
-- The Witcher 3: Wild Hunt (id = 2)
INSERT INTO game_genre (game_id, genre_id) VALUES (2, 1);
INSERT INTO game_genre (game_id, genre_id) VALUES (2, 3);
-- Red Dead Redemption 2 (id = 3)
INSERT INTO game_genre (game_id, genre_id) VALUES (3, 1);
INSERT INTO game_genre (game_id, genre_id) VALUES (3, 2);
-- Dark Souls III (id = 4)
INSERT INTO game_genre (game_id, genre_id) VALUES (4, 1);
INSERT INTO game_genre (game_id, genre_id) VALUES (4, 3);
-- Persona 5 (id = 5)
INSERT INTO game_genre (game_id, genre_id) VALUES (5, 3);
INSERT INTO game_genre (game_id, genre_id) VALUES (5, 6);


-- The Legend of Zelda: Breath of the Wild (id = 1)
INSERT INTO game_platform (game_id, platform_id) VALUES (1, 4);

-- The Witcher 3: Wild Hunt (id = 2)
INSERT INTO game_platform (game_id, platform_id) VALUES (2, 1);
INSERT INTO game_platform (game_id, platform_id) VALUES (2, 2);
INSERT INTO game_platform (game_id, platform_id) VALUES (2, 3);

-- Red Dead Redemption 2 (id = 3)
INSERT INTO game_platform (game_id, platform_id) VALUES (3, 1);
INSERT INTO game_platform (game_id, platform_id) VALUES (3, 2);
INSERT INTO game_platform (game_id, platform_id) VALUES (3, 3);

-- Dark Souls III (id = 4)
INSERT INTO game_platform (game_id, platform_id) VALUES (4, 1);
INSERT INTO game_platform (game_id, platform_id) VALUES (4, 2);
INSERT INTO game_platform (game_id, platform_id) VALUES (4, 3);

-- Persona 5 (id = 5)
INSERT INTO game_platform (game_id, platform_id) VALUES (5, 2);
INSERT INTO game_platform (game_id, platform_id) VALUES (5, 5);




