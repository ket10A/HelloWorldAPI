package com.example.helloworldapi.mysql;

import com.example.helloworldapi.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MySQLRepository extends JpaRepository<Message, Integer> {
}
