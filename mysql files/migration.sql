USE adlister_db;

drop table if exists users;
drop table if exists ads;

CREATE TABLE users(
  id INT UNSIGNED AUTO_INCREMENT NOT NULL,
  username VARCHAR(150) not null,
  email VARCHAR(150) not null,
  password VARCHAR(150) not null,
  PRIMARY KEY (id)
);

CREATE TABLE ads(
  id int UNSIGNED AUTO_INCREMENT not null,
  user_id int UNSIGNED NOT NULL,
  title varchar(200) not null,
  description text not null,
  PRIMARY KEY(id),
  FOREIGN KEY(user_id) REFERENCES users(id)
);