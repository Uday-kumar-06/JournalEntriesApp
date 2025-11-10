//package com.webCof.uniqueApp;
//
//import com.webCof.uniqueApp.entity.User;
//import com.webCof.uniqueApp.repository.UserRepository;
//import com.webCof.uniqueApp.service.UserService;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ArgumentsSource;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
//@SpringBootTest
//public class UserServiceTest {
//
//    @Autowired
//    private UserRepository userRepository;
//
//
//    @Autowired
//    private UserService userService;
//
//
//    @ParameterizedTest
//    @ArgumentsSource(UserArgumentsProvider.class)
//    public void testSaveNewUser(User user){
//
//        assertTrue(userService.saveNewUser(user));
//    }
//
//
//    @Disabled
//    @ParameterizedTest
//    @CsvSource({
//            "1,1,2",
//            "2,10,12",
//            "3,11,15"
//    })
//    public void test(int a ,int b, int expected){
//        assertEquals(expected,a+b);
//    }
//}
