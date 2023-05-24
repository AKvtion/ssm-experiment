package org.liangfacan53.courses.sf.ssm.springmvc.controller;

import org.liangfacan53.courses.sf.ssm.springmvc.pojo.User;
import org.liangfacan53.courses.sf.ssm.springmvc.service.ApiUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiUserController {
    @Autowired
    private ApiUserService service;

    @GetMapping("/users")
    public List<User> users() {
        return service.getUsers();
    }

    @GetMapping("/users/{id}")
    public Map<String, Object> user(@PathVariable("id") int id) {
        HashMap<String, Object> ret = new HashMap<>();
        try {
            User user = service.getUser(id);
            ret.put("success", true);
            ret.put("user", user);
        } catch (Exception e) {
            ret.put("success", false);
            ret.put("message", e.getMessage());
        }
        return ret;
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody LoginRequest loginRequest) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            User user = service.login(loginRequest.email, loginRequest.password);
            map.put("user", user);
        } catch (Exception e) {
            map.put("error", "LOGIN_FAILED");
            map.put("message", e.getMessage());
        }
        return map;
    }

    public static class LoginRequest {
        public String email;
        public String password;
    }
}

