package com.megamatris.infrastructure.service;

import com.megamatris.infrastructure.dao.UserRepository;
import com.megamatris.infrastructure.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iman on 10/22/2020.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {

        Iterable all = userRepository.findAll();

        ArrayList users = new ArrayList<User>();
        all.forEach(e -> users.add(e));

        return users;
    }

    public Long count() {

        return userRepository.count();
    }

//    public void deleteById(Long userId) {
//
//        userRepository.deleteById(userId);
//    }
}
