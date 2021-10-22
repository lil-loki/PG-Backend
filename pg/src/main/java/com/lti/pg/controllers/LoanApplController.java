package com.lti.pg.controllers;

import java.io.IOException;
import java.util.List;

import com.lti.pg.beans.*;
import com.lti.pg.controllers.LoanApplController.Status.StatusType;
import com.lti.pg.exception.CustomerServiceException;
import com.lti.pg.services.ServiceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins="*")
@RestController
@RequestMapping

public class LoanApplController {

    @Autowired
	private ServiceLayer userService;   


    @PostMapping("/vehicleregister")
	public Status registerVehicle(@RequestBody Vehicle vehicle) 
	{
		try {
			userService.registerVehicle(vehicle);
			Status status=new Status();
			status.setStatus(StatusType.SUCCESS);
			status.setMessage("Registration Successful");
			return status;
		}
		
		catch (CustomerServiceException e) {
			Status status=new Status();
			status.setStatus(StatusType.FAILURE);
			status.setMessage(e.getMessage());
			return status;
		}
	}
	
	@PostMapping("/registerloan")
	public Status registerloan(@RequestBody Loan loan) 
	{
		try 
		{
			userService.registerLoan(loan);
			Status status=new Status();
			status.setStatus(StatusType.SUCCESS);
			status.setMessage("Loan Registration Successful");
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
	
	@GetMapping("/viewapplicationform")
	public List<Loan> viewApplicationForm() 
	{	
		return userService.viewApplicationForm();

	}
	
	@GetMapping("/viewallusers")
	public List<UserTable> viewAllUsers() 
	{	
		return userService.viewAllUsers();

	}
	
	@GetMapping("/viewrejectedusers")
	public List<Loan> viewRejectedUsers() 
	{	
		return userService.viewRejectedUsers();

	}
	
	@GetMapping("/viewapprovedusers")
	public List<Loan> viewApprovedUsers() 
	{	
		return userService.viewApprovedUsers();

	}
	
	@GetMapping("/viewpendingusers")
	public List<Loan> viewPendingUsers() 
	{	
		return userService.viewPendingUsers();

	}

	@PostMapping("/upload")
	public void upload(@RequestParam MultipartFile file) throws IOException {
		userService.upload(file);
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
