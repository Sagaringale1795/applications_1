package userservice.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import userservice.entity.User;
import userservice.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService svc;

    @PostMapping
    public User add(@RequestBody User u) {
        return svc.create(u);
    }

    @GetMapping
    public List<User> all() {
        return svc.list();
    }

    @GetMapping("{id}")
    public User one(@PathVariable Long id) {
        return svc.find(id);
    }


}

