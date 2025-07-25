package userservice.service;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import userservice.entity.User;
import userservice.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private  UserRepository repo;

    public User create(User u) {
        return repo.save(u);
    }

    public List<User> list() {
        return repo.findAll();
    }

    public User find(Long id) {
        return repo.findById(id).orElse(null);
    }
}
