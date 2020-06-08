package com.example.Test.register;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterResource {
	@Autowired
	private RegisterDaoService service;

	@GetMapping("/register")
	public List<Register> retrieveAllUsers() {
		return service.findAll();
	}

	@GetMapping("/register/{id}")
	public Register retrieveRegister(@PathVariable int id) {
		return service.findOne(id);
	}
	
	@PostMapping("/register")
	public void createRegister(@RequestBody Register register){
		Register savedRegister = service.save(register);
	}

}
