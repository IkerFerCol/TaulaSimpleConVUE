//package com.ikefercol.TaulaSimple.controller;
//
//import com.ikefercol.TaulaSimple.model.DTO.UserRegisterRequest;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//
//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;
//
//    @Autowired
//    private UserDetailsManager userDetailsManager;
//
//    @PostMapping("/register/")
//    public String register(@Valid @RequestBody UserRegisterRequest userRegisterRequest){
//        if (userDetailsManager.userExists(userRegisterRequest.getUsername())){
//            return "ERROR: el usuario ya existe.";
//        }
//
//        userDetailsManager.createUser(User.builder()
//                .username(userRegisterRequest.getUsername())
//                .password(passwordEncoder.encode(userRegisterRequest.getPassword()))
//                .roles("USER")
//                .build());
//        return "OK";
//    }
//
//}
