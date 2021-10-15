package com.lti.pg.controllers;

import java.util.List;

import com.lti.pg.beans.LoanApproval;
import com.lti.pg.services.LoanApprovalServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/loans")

public class LoanController {


    @Autowired
	private LoanApprovalServiceImpl loanApprovalServiceImpl;

    @GetMapping("")
    public List<LoanApproval> getLoans()
	{
		List<LoanApproval> Loanlist= loanApprovalServiceImpl.getList();
		return Loanlist;			
	}

    @GetMapping("/accnum/{id}")
    public String getLoansAcc(@PathVariable(value="id") int accno)
	{
		return " Loans ..... of" + accno+"";			
	}

    @GetMapping("/lid/{id}")
    public String getLoansId(@PathVariable(value="id") int Lid)
	{
		return " Loans ..... of" + Lid+"";			
	}

    @DeleteMapping(value = "/accnum/{id}")
    public String deleteLoansAcc(@PathVariable int accno) {
        return accno+" is deleted";

    }

    @DeleteMapping(value = "/lid/{id}")
    public String deleteLoanId(@PathVariable int id) {
        return id +"  is deleted";

    }    
    
}
