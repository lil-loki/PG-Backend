package com.lti.pg.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/users")

public class UserController {

    @PostMapping(value = "/login")
	public String login()
	{
		return "Login";			
	}

    @PostMapping(value = "/signup")
	public String register()
	{
		return "Register";			
	}

    @PostMapping(value = "/resetinit")
	public String resetInit()
	{
		return "Initializing Reset";			
	}

    @PostMapping(value = "/resetpass")
	public String resetPass()
	{
		return "Reset Password";			
	}
}
