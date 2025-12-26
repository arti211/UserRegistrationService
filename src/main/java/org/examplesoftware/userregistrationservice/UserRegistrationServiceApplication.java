package org.examplesoftware.userregistrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UserRegistrationServiceApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(UserRegistrationServiceApplication.class, args);
        var userService = applicationContext.getBean(UserService.class);
        userService.registerUser(new User("Joe.Bloggs@gmail.com","pwd","Joe Bloggs",Long.parseLong("1234")));
        userService.registerUser(new User("Joe.Bloggs@gmail.com","pwd","Joe Bloggs",Long.parseLong("1234")));


    }
}
