package com.invoicely.invoice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invoicely.invoice.model.User;
import com.invoicely.invoice.repository.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserControler {
	
	@Autowired
	private UserRepository userRepository;
	
	// create user
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return this.userRepository.save(user);
	}
	
	// login 
	@GetMapping("/login")
	public User login(@RequestBody User user) {
		User data = this.userRepository.findByEmail(user.getEmail());
		return data;
	}	
	
	// sample get all users
	@GetMapping("/all")
	public List<User> getAllUSers(){
		return this.userRepository.findAll();
	}
	
}
