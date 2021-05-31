package ru.nsu.fit.g20221.afanasyev.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.nsu.fit.g20221.chmil.controller.user.model.User;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByFirstName(String firstName);

    public List<User> findByLastName(String lastName);

}
