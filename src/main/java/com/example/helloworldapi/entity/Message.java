package com.example.helloworldapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "message", schema = "MySchema")
public class Message {

    @Id
    private Integer id;
    private String message;

}
