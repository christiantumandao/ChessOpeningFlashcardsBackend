package com.chessOpeningFlashcards.backend.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);

    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {

    }

    // increment corrects
    @PutMapping("/set-corr{id}")
    public void updateUser(@PathVariable int id, @RequestBody User user) {
        User updatedUser = null;
        try {
            // grabing user instance called to update
            updatedUser = userRepository.findById(id).get();

            // updating any vars
            updatedUser.setFirstName(user.getFirstName());
            updatedUser.setLastName(user.getLastName());
            updatedUser.setUsername(user.getUsername());
            updatedUser.setPassword(user.getPassword());
            updatedUser.setCorrects(user.getCorrects());
            updatedUser.setFails(user.getFails());

            // updating in db
            userRepository.save(updatedUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // increment fails

    @RequestMapping("/all-users")
    public List<User> getAllUsers() {
        List<User> allUsers = new ArrayList<>();
        userRepository.findAll().forEach(allUsers::add);
        return allUsers;
    }

    @RequestMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return userRepository.findById(id).get();
    }
}
