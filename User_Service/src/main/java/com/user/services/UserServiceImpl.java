package com.user.services;

import com.user.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<User> list=List.of(
            new User(1L,"Rohit","987654321"),
            new User(2L,"Pradeep","985654321"),
            new User(3L,"Tarun","984550320")
    );

    @Override
    public User getuser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null) ;
    }
}
