package com.baeldung.entity;


import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {

    public  User() {}

    @Id
    private String id = UUID.randomUUID().toString();
    private String username;
    private String password;
}
