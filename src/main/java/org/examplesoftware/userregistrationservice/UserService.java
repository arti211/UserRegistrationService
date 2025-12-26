package org.examplesoftware.userregistrationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.lang.IO.readln;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

 public void registerUser(User user){
    try {
        userRepository.save(user);
        notificationService.send("User: "+ user.getName() +" has been created. ", user.getEmail());
    }
    catch (Exception e) {
        System.out.println("Error while saving user: " + e.getMessage());
    }

 }
}
