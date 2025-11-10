package com.webCof.uniqueApp.controller;

import com.webCof.uniqueApp.api.response.WeatherResponse;
import com.webCof.uniqueApp.entity.User;
import com.webCof.uniqueApp.repository.UserRepository;
import com.webCof.uniqueApp.service.UserService;
import com.webCof.uniqueApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//controller --> service --> repository

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WeatherService weatherService;


    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAll();
    }

    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody User user ){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = authentication.getName();
        User userInDb = userService.findByUserName(userName);
        if(userInDb != null){
            userInDb.setUserName(user.getUserName());
            userInDb.setPassword(user.getPassword());
            userService.saveNewUser(userInDb);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/user")
    public ResponseEntity<?> deleteByUserName(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        userRepository.deleteByUserName(authentication.getName());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/greet")
    public ResponseEntity<String> greetings(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        WeatherResponse weatherResponse = weatherService.getWeather("Mumbai");
        String greet = "";
        if(weatherResponse != null && weatherResponse.getCurrent() != null){
            greet = " weather feels like "+weatherResponse.getCurrent().getFeelsLike()+"°C";
        }

        return new ResponseEntity<>("Hi " + authentication.getName() + greet, HttpStatus.OK);
    }


}
