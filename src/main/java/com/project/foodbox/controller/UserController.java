package com.project.foodbox.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.foodbox.model.User;
import com.project.foodbox.repository.UserRepository;
@RestController
//@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(path = "users")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/get")
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@PostMapping("/add")
	public void createUser(@RequestBody User user) {
		userRepository.save(user);
		System.out.println(user);
	}
	@DeleteMapping(path = { "/{id}" })
	public User deleteUser(@PathVariable("id") long id) {
		Optional<User> user = userRepository.findById(id);
		if(user.isPresent()) {
		userRepository.deleteById(id);
		System.out.println("User deleted Successfully");
		return user.get();
		}
		else {
			return null;
		}
	}
}
