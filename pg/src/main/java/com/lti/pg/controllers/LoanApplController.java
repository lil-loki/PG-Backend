package com.lti.pg.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/loanapp")

public class LoanApplController {

    @PostMapping(value = "/apply")
	public String apply()
	{
		return "Loan Application";			
	}

    @GetMapping("")
    public String getLoanApps()
	{
		return "All  Loans  Applications .....";			
	}

    @GetMapping("/accnum/{id}")
    public String getLoanAppsAcc(@PathVariable(value="id") int accno)
	{
		return " Loans ..... of" + accno+"";			
	}

    @GetMapping("/lid/{id}")
    public String getLoanAppsId(@PathVariable(value="id") int Lid)
	{
		return " Loans ..... of" + Lid+"";			
	}

    @DeleteMapping(value = "/accnum/{id}")
    public String deleteLoanAppsAcc(@PathVariable int accno) {
        return accno+" is deleted";

    }

    @DeleteMapping(value = "/lid/{id}")
    public String deleteLoanAppsId(@PathVariable int id) {
        return id +"  is deleted";

    }


    
    
}