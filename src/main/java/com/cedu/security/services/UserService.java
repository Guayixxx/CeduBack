package com.cedu.security.services;

import com.cedu.security.exceptions.UserAlreadyExistException;
import com.cedu.security.exceptions.UserNotFoundException;
import com.cedu.security.model.User1;

import java.util.List;

public interface UserService {
    List<User1> getall() throws UserNotFoundException;

    User1 addUser(User1 user) throws UserAlreadyExistException;

    User1 getUserByUserName(String username)  throws UserNotFoundException;
}
