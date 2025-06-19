package com.jwt.Example.JwtExample3.controller;

import com.jwt.Example.JwtExample3.model.User;
import com.jwt.Example.JwtExample3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

   // Logger logger = LoggerFactory.getLogger(HomeController.class);

//    @RequestMapping("/test")

    @Autowired
    private UserService userService;
//try jenkin

    @GetMapping("/users")
    public List<User> getUser() {
        //this.logger.warn("This is working message");
        System.out.println("Getting user");
        return this.userService.getUsers();
    }

    @GetMapping("/current-user")
    public String getCurrentUserLoggedIn(Principal principal){
        return principal.getName();
    }


}