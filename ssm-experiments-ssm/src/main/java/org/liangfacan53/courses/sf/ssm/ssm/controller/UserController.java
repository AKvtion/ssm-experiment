package org.liangfacan53.courses.sf.ssm.ssm.controller;

import org.liangfacan53.courses.sf.ssm.ssm.pojo.User;
import org.liangfacan53.courses.sf.ssm.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public Map<String, Object> getUserById(@PathVariable("id") int id) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            User user = service.getUserById(id);
            map.put("user", user);
        } catch (Exception e) {
            map.put("message", e.getMessage());
        }
        return map;
    }
}

