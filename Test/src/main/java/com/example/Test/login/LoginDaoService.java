package com.example.Test.login;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class LoginDaoService {

	private static List<Login> logins = new ArrayList<>();

	private static int usersCount = 3;

	static {
		logins.add(new Login(1,"abinash","modestack123"));
		logins.add(new Login(2, "divya","divyahk123"));
		logins.add(new Login(3, "Jack","jack123"));
	}

	public List<Login> findAll() {
		return logins;
	}

	public Login save(Login login) {
		if (login.getId() == null) {
			login.setId(++usersCount);
		}
		logins.add(login);
		return login;
	}

	public Login findOne(int id) {
		for (Login login : logins) {
			if (login.getId() == id) {
				return login;
			}
		}
		return null;
	}
}
