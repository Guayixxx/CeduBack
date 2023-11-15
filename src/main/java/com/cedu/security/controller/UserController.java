package com.cedu.security.controller;

import com.cedu.security.exceptions.UserAlreadyExistException;
import com.cedu.security.exceptions.UserNotFoundException;
import com.cedu.security.services.UserService;
import com.cedu.security.model.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins={"http://localhost:4200","http://localhost:8080'"})
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getall")
    public ResponseEntity<List<User1>> getall() throws IOException {
        try{
            return new ResponseEntity<List<User1>>(userService.getall(), HttpStatus.OK);
        }catch (UserNotFoundException e){
            return new ResponseEntity("User not Found", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<User1> addUser(@RequestBody User1 user) throws IOException {
        try{
            return new ResponseEntity<User1>(userService.addUser(user), HttpStatus.OK);
        }catch (UserAlreadyExistException e){
            return new ResponseEntity("User already exists", HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/getbyusername/{username}")
    public ResponseEntity<User1> getUserByUserName(@PathVariable String username) throws IOException {
        try{
            return new ResponseEntity<User1>(userService.getUserByUserName(username), HttpStatus.OK);
        }catch (UserNotFoundException e){
            return new ResponseEntity("User not Found", HttpStatus.NOT_FOUND);
        }
    }

}
