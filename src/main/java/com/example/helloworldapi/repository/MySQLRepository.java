package com.example.helloworldapi.repository;

import com.example.helloworldapi.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySQLRepository extends JpaRepository<Message, Integer> {
}
