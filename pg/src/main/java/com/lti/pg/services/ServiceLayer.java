package com.lti.pg.services;

import java.util.List;

import com.lti.pg.beans.*;

public interface ServiceLayer {
    
    void register(UserTable user);

	UserTable login(String email, String password);
	
	Admin loginadmin(String adminEmail, String adminPassword);
	
	void registerAccount(Account account);
	
	void registerVehicle(Vehicle vehicle);
	
	void registerLoan(Loan loan);
	
	List<UserTable> viewAllUsers(); 
	
	List<Loan> viewApplicationForm(); 
	
	List<Loan> viewRejectedUsers();

	List<Loan> viewApprovedUsers();

	List<Loan> viewPendingUsers();

	void approveLoan(long loanId);

	void rejectLoan(long loanId);

	List<Loan> viewLoanStatus(long userId);
}
