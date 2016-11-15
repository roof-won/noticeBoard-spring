create table guest(
  num int auto_increment,
  name varchar(30) not null,
  content varchar(3000) not null,
  regDate datetime default now(),
  primary key(num)
);