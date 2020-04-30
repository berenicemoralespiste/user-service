package com.firstservice.user.repository;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "user")
public class User {

    @Id
    private String username;
    @Field("name")
    private String name;
    @Field("lastname")
    private String lastname;
    @Field("company")
    private String company;

    public String getFullName() {
        return name + " " + lastname;
    }

}
