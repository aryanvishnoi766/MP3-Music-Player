use login_schema;
show tables;
CREATE table users(
idusers INT auto_increment,
username varchar(255) NOT NULL,
password varchar(255) Not Null,
email varchar(255) Not Null,
primary key(username));
select* from users;
