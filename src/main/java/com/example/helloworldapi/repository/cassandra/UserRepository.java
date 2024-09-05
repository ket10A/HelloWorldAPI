package com.example.helloworldapi.repository.cassandra;

import com.example.helloworldapi.entity.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CassandraRepository<User, Integer> {
}
