drop table product if exists;

create table product(

    id varchar(255) not null primary key,
    name varchar(300) not null,
    description varchar(500),
    price numeric(20, 2)

);