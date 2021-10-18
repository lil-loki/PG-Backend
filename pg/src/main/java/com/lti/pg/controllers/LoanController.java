package com.lti.pg.controllers;

import java.util.List;

import com.lti.pg.Dto.*;
import com.lti.pg.beans.*;
import com.lti.pg.controllers.LoanController.Status.StatusType;
import com.lti.pg.exception.CustomerServiceException;
import com.lti.pg.services.ServiceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@RequestMapping

public class LoanController {

    @Autowired
	private ServiceLayer userService;   
	
	
	@GetMapping("/viewloanstatus/{userId}")
	public List<Loan> viewLoanStatus(@PathVariable("userId") long userId, IdDto iddto) 
	{	
		return userService.viewLoanStatus(userId);

	}
	
	@PostMapping("/rejectloan")
	public Status rejectLoan(@RequestBody long loanId) 
	{
		try 
		{
			userService.rejectLoan(loanId);
			Status status=new Status();
			status.setStatus(StatusType.SUCCESS);
			status.setMessage("Loan Rejected");
			return status;
		}
		
		catch (CustomerServiceException e) 
		{
			Status status=new Status();
			status.setStatus(StatusType.FAILURE);
			status.setMessage(e.getMessage());
			return status;
		}
	}
	
	@PostMapping("/approveloan")
	public Status register(@RequestBody long loanId) 
	{
		try 
		{
			userService.approveLoan(loanId);
			Status status=new Status();
			status.setStatus(StatusType.SUCCESS);
			status.setMessage("Loan Approved");
			return status;
		}
		
		catch (CustomerServiceException e) 
		{
			Status status=new Status();
			status.setStatus(StatusType.FAILURE);
			status.setMessage(e.getMessage());
			return status;
		}
	}

    public static class LoginStatus extends Status {
        private long userId;
        private String name;
        
        public long getuserId() {
            return userId;
        }
        public void setUserId(long userId) {
            this.userId = userId;
        }
        public String getUserNameFirst() {
            return name;
        }
        public void setUserNameFirst(String name) {
            this.name = name;
        }
    }
    
    public static class LoginAdminStatus extends Status {
        private long adminId;
        private String adminName;
        
        public long getadminId() {
            return adminId;
        }
        public void setAdminId(long adminId) {
            this.adminId = adminId;
        }
        public String getAdminNameFirst() {
            return adminName;
        }
        public void setAdminNameFirst(String adminName) {
            this.adminName = adminName;
        }
    }


public static class Status {
    
    private StatusType status;
    private String message;
    
    public static enum StatusType {
        SUCCESS,FAILURE;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
}

    
	
    
}
