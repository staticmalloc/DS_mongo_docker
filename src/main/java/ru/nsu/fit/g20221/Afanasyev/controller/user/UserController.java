package ru.nsu.fit.g20221.afanasyev.controller.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.fit.g20221.chmil.controller.user.model.User;
import ru.nsu.fit.g20221.chmil.repository.UserRepository;

@RestController
public class UserController {
    private final UserRepository userRepository;


    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/users")
    User newUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/users/{id}")
    User one(@PathVariable String id) {
        return userRepository.findById(id).orElseThrow();
    }

    @GetMapping("/users")
    List<User> getAll() {
        return userRepository.findAll();
    }
}
