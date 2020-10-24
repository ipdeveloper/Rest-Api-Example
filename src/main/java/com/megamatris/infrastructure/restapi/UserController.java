package com.megamatris.infrastructure.restapi;

import com.megamatris.infrastructure.model.User;
import com.megamatris.infrastructure.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller // This means that this class is a Controller
//@RequestMapping(path = "/user") // This means URL's start with /demo (after Application path)
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> allUsers() {

        return userService.findAll();
    }

    @GetMapping("/users/count")
    public Long count() {

        return userService.count();
    }

//    @DeleteMapping("/users/{id}")
//    public void delete(@PathVariable String id) {
//
//        Long userId = Long.parseLong(id);
//        userService.deleteById(userId);
//    }
}
