use master;
go
create database AmazonBotDB;
go

use AmazonBotDB;
go

CREATE TABLE accounts
(
  email  varchar(100) NOT NULL,
  password varchar(100),
  first_name  varchar(100),
  second_name varchar(100),
  CONSTRAINT PK_Account_email PRIMARY KEY (email)
)

CREATE TABLE goods
(
  asin varchar(20) NOT NULL,
  name varchar(300),
  shop_url varchar(500),
  CONSTRAINT PK_goods_asin PRIMARY KEY (asin)
)

CREATE TABLE good_action
(
  id int identity(1, 1),
  asin varchar(20),
  email varchar(100),
  action varchar(300),
  action_time datetime,
  constraint FK_good_action_asin_goods Foreign key (asin) references goods(asin),
  constraint FK_good_action_email_accounts Foreign key (email) references accounts(email)
)