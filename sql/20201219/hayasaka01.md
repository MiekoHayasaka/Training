#以下のデータベースを作成せよ

CREATE DATABASE product_db
DEFAULT CHARACTER SET utf8

#以下の3つのテーブルを作成せし、初期データを挿入せよ

##category
CREATE TABLE category(
  id int PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(250) NOT NULL,
	brand_id int
);

INSERT INTO category(name)
	VALUES('筆記具'),
	VALUES('修正具'),
	VALUES('のり'),
	VALUES('その他'),

##brand
CREATE TABLE brand(
  id int PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(250) NOT NULL,
	category_id int
);

INSERT INTO brand(name,category_id)
	VALUES('MONO'),
	VALUES('PiT'),
	VALUES('ZOOM'),
	VALUES('ippo!'),
	VALUES('Yo-i'),
	VALUES('ABT');

##products
CREATE TABLE products (
  id int PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(250) NOT NULL,
	unit_price int NOT NULL,
	category_id int NOT NULL,
	brand_id int NOT NULL
);

INSERT INTO products(name,unit_price,category_id,brand_id)
	VALUES('鉛筆',90)
	VALUES('ボールペン（黒）',120)
	VALUES('シャープペンシル',300)
	VALUES('消しゴム',100)

##maker
  id int PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(250) NOT NULL,
	product_id int NOT NULL,
	
INSERT INTO maker(name)
	VALUES('トンボ鉛筆')
	VALUES('三菱鉛筆')
	VALUES('パイロットコーポレーション')
	VALUES('ぺんてる')
	VALUES('ゼブラ')


##stores
CREATE TABLE stores (
  id int PRIMARY KEY AUTO_INCREMENT,
	name int NOT NULL,
	unit_price int NOT NULL,


INSERT INTO `cds` (`id`, `title`, `cat_id`, `price`)
VALUES
(1, 'PLEASE PLEASE ME', 1, 2800),
(2, 'With the Beatles', 1, 2800),
(3, 'A Hard Days Night', 1, 2800),
(4, '17歳の地図', 2, 3200),
(5, '回帰線', 2, 3200),
(6, '壊れた扉から', 2, 3200),
(7, '北の大地', 3, 3600),
(8, '目蒲線物語', NULL, 1200);

以下の問に答えよ(20問)
cdsに以下のデータを挿入せよ (Help,1,2800)

tetetwete
