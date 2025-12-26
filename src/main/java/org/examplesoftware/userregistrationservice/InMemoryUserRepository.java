package org.examplesoftware.userregistrationservice;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class InMemoryUserRepository implements UserRepository{
    HashMap<String, User> map = new HashMap<String, User>();
    @Override
    public void save(User user) {
        if (!map.containsKey(user.getEmail()))
                map.put(user.getEmail(), user);
        else
            throw new RuntimeException("User with email " + user.getEmail() + " already exists");
    }
}
