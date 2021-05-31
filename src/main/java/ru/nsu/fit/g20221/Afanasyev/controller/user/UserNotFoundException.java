package ru.nsu.fit.g20221.afanasyev.controller.user;

class UserNotFoundException extends RuntimeException {

    UserNotFoundException(Long id) {
        super("Could not find user " + id);
    }
}
