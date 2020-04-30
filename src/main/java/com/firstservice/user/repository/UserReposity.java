package com.firstservice.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserReposity extends MongoRepository<User, String> {
    public User findByUsernameAndCompany(String email, String company);
}
