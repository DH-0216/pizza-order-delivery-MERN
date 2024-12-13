package com.pizzadelivery.pizza_backend.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "users")
public class User {

    // Getters and setters
    @Id
    private String id;
    private String UserName;
    private String email;
    private String password;

}
