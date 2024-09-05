#!/usr/bin/env bash

until printf "" 2>>/dev/null >>/dev/tcp/cassandra/9042; do
    sleep 5;
    echo "Waiting for cassandra...";
done

echo "Creating keyspace"
cqlsh cassandra -u cassandra -p cassandra -e "CREATE KEYSPACE IF NOT EXISTS helloworld WITH replication = {'class': 'SimpleStrategy', 'replication_factor': '1'}; USE helloworld;
CREATE TABLE User(
    userId int PRIMARY KEY ,
    userName text,
    address text
);"
