package com.webCof.uniqueApp.controller;


import com.webCof.uniqueApp.entity.User;
import com.webCof.uniqueApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;



    @GetMapping("/all-users")
    public ResponseEntity<?> getAllUsers(){
       List<User> all = userService.getAll();
       if(all != null && !all.isEmpty()){
           return new ResponseEntity<>(all, HttpStatus.OK);
       }
       return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    //should not be created here because "/admin" path is authenticated....
    @PostMapping("/create-admin-user")
    public ResponseEntity<?> createUser(@RequestBody User user){
        try{
            userService.saveNewAdmin(user);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            throw new RuntimeException("There is error",e);
        }
    }

}
