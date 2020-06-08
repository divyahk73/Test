package com.example.Test.register;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RegisterDaoService {
	private static List<Register> registers = new ArrayList<>();

	private static int usersCount = 3;

	static {
		registers.add(new Register(1, "abinash", "modestack123", "abinash@modestack.com", "bangalore"));
		registers.add(new Register(2, "divya","divyahk123","divyahk73@gmail.com","tiptur"));
		registers.add(new Register(3, "deepak","deepak123","deepak.hk6@gmail.com","tumkr"));
	}

	public List<Register> findAll() {
		return registers;
	}

	public Register save(Register register) {
		if (register.getId() == null) {
			register.setId(++usersCount);
		}
		registers.add(register);
		return register;
	}

	public Register findOne(int id) {
		for (Register register : registers) {
			if (register.getId() == id) {
				return register;
			}
		}
		return null;
	}

}
