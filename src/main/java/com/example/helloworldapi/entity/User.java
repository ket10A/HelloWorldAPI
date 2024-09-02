package com.example.helloworldapi.entity;

import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

@Table(name = "User", schema = "MySchema")
@Data
@Getter
@Setter
public class User {

    @PrimaryKey
    private Integer userId;
    private String userName;
    private String address;

}
