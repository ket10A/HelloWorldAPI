create keyspace helloworld WITH replication= {'class':'SimpleStrategy', 'replication_factor': 1 };

USE helloworld;

CREATE TABLE User(
                     userId int PRIMARY KEY ,
                     userName text,
                     address text
);