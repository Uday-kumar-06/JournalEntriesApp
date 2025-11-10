//package com.webCof.uniqueApp;
//
//import com.webCof.uniqueApp.entity.User;
//import com.webCof.uniqueApp.repository.UserRepository;
//import com.webCof.uniqueApp.service.UserDetailsServiceImpl;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.*;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//public class UserDetailsServiceImplTest {
//
//    @InjectMocks
//    private UserDetailsServiceImpl userDetailsService;
//
//    @Mock
//    private UserRepository userRepository;
//
////    if we already wrote ->> @ExtendWith(MockitoExtension.class)
////    then no need of manual init of Mockito
//
////    @BeforeEach
////    void setUp(){
////        MockitoAnnotations.openMocks(this);
////    }
//
//    @Test
//    void loadUserByUsernameTest(){
//        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("Uday").password("uafdyjfnj").roles(new ArrayList<>()).build());
//        UserDetails user = userDetailsService.loadUserByUsername("Chintu");
//        Assertions.assertNotNull(user);
//    }
//}
