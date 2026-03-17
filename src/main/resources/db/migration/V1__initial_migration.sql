/* Creating the schema */
create schema store;

/*Using the database store */
use store;

/*creating the table and data inside the database*/
create table users (
                       id bigint not null auto_increment primary key,
                       name varchar (255) not null,
                       email varchar (255) not null,
                       password varchar (255) not null
);

create table addresses (
                           id bigint not null auto_increment,
                           street varchar (255) not null,
                           city varchar (255) not null,
                           zip varchar (255) not null,
                           user_id bigint not null,
                           constraint fk_userid
                               foreign key (user_id)
                                   references users(id)
);