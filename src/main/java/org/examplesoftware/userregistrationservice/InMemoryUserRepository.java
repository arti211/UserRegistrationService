package org.examplesoftware.userregistrationservice;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class InMemoryUserRepository implements UserRepository{
    @Override
    public void save(User user) {
        HashMap<String,User> map = new HashMap<>();
        map.put(user.getEmail(),user);
    }
}
