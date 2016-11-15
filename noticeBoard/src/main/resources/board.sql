create table board(
  no int auto_increment,
  name varchar(20) not null,
  passwd varchar(20) not null,
  title varchar(100) not null,
  content text not null,
  regdate timestamp default now(),
  modifydate timestamp default now(),
  hit int default 0,
  primary key(no)
);