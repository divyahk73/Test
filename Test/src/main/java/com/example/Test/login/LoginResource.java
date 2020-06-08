package com.example.Test.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginResource {
	@Autowired
	private LoginDaoService service;

	@GetMapping("/login")
	public List<Login> retrieveAllLogins() {
		return service.findAll();
	}

	@GetMapping("/login/{id}")
	public Login retrieveLogin(@PathVariable int id) {
		return service.findOne(id);
	}
	
	@PostMapping("/login")
	public void createUser(@RequestBody Login login){
		Login savedLogin = service.save(login);
	}

}
