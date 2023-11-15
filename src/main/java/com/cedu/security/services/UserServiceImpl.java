package com.cedu.security.services;

import com.cedu.security.exceptions.UserAlreadyExistException;
import com.cedu.security.exceptions.UserNotFoundException;

import com.cedu.security.model.User1;
import com.cedu.security.repository.UserRepository1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository1 userRepository;


    @Override
    public List<User1> getall() throws UserNotFoundException {
        List<User1> users=userRepository.findAll();
        if (users.isEmpty()){
            throw new UserNotFoundException();
        }else {
           return users;
        }
    }

    @Override
    public User1 addUser(User1 user) throws UserAlreadyExistException {
       Optional<User1> user1=userRepository.findById(user.getUserName());

       if (user1.isPresent()){
           throw new UserAlreadyExistException();
       }else {
           return userRepository.save(user);
       }
    }

    @Override
    public User1 getUserByUserName(String username) throws UserNotFoundException {
        Optional<User1> user1=userRepository.findById(username);

        if (user1.isPresent()){
            return user1.get();
        }else {
            throw new UserNotFoundException();
        }
    }

}
