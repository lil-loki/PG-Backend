package com.lti.pg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.pg.beans.LoanApplication;
import com.lti.pg.dao.LoanApplicationDao;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/loanapp")

public class LoanApplController {
	
	@Autowired
	LoanApplicationDao loanApplication;
	
    @PostMapping(value = "/apply")
	public String apply()
	{
		return "Loan Applied";	
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
