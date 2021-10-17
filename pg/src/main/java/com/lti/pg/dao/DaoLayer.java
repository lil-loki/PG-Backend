package com.lti.pg.dao;

import com.lti.pg.beans.*;
import java.util.List;

public interface DaoLayer {
    
    //----------------------Login Methods----------------------------------------------------
    public long registerUser(UserTable user); //user registration 
	boolean isUserPresent(String userEmail); //user login 
	public long findUserIdByEmailAndPassword(String userEmail, String userPass); // user login 

    public long registerAdmin(Admin admin); //register an admin
	boolean isAdminPresent(String adminEmail); //admin login 
	public long findAdminIdByEmailAndPassword(String adminEmail, String userPass);
	public Admin findAdminById(long adminId); // admin login 

    //----------------------Loan Methods-------------------------------------------------------
    public long registerLoan(Loan loan); //apply loan
    public List<Loan> fetchApplicationForm();
    public Loan getLoanById(long loanId);	
	public void removeLoanById(long loanId);	
	public Loan retrieveLoanByloanType(String loan);	
	public void removeLoanByApplicationStatus(String applicationStatus);

	//----------------------Account Methods----------------------------------------------------
    public String registerAccount(Account account); //create account
    public boolean doesAccountExist(String accNumber);//checks if account exists

    //----------------------User Methods-------------------------------------------------------
	public UserTable findUserByUserID(long userId); //finding user object after login 
	public void removeUserByUserID(long userId); //remove user 	
    public List<UserTable> fetchAllRegisteredUsers(); // find all registered users 

    //----------------------Admin Methods------------------------------------------------------	
	public List<Loan> allApprovedUsers(); //approved user list
	public List<Loan> allPendingUsers(); //pending user list
	public List<Loan> allRejectedUsers(); //rejected user list
    public List<Loan> viewAllLoans(); //all loans	
	public void approveLoan(long loanId); //for loan's approval
	public void rejectLoan(long loanId); //rejecting loan	
	public List<Loan> getLoanStatusByUserId(long userId); //getting loan Status	
	
	
	//----------------------Vehicle Methods------------------------------------------------------	
	boolean isVehiclePresent(String vehicleId); //check if the vehicle is present
	public String registerVehicle(Vehicle vehicle); //register vehicle	
}
