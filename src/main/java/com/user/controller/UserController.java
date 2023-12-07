package com.user.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.user.entity.User;
import com.user.repository.UserRepository;

@Controller
public class UserController {
	
	private final UserRepository userRepository;
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	@GetMapping("/user")
	public String listUsers(Model model) {
		List<User> users= userRepository.findAll();
		model.addAttribute("users",users);
				return"user/list";
	}
}
