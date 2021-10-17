package com.lti.pg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.lti.pg.beans.Account;
import com.lti.pg.beans.Admin;
import com.lti.pg.beans.Loan;
import com.lti.pg.beans.UserTable;
import com.lti.pg.beans.Vehicle;

import org.springframework.stereotype.Repository;

@Repository
public class DaoLayerImpl implements DaoLayer{

    @PersistenceContext
	EntityManager em;
    
    @Override
	@Transactional
	public long registerUser(UserTable user) {
		UserTable u = em.merge(user);
		return u.getUserId();
	}
	
	// User Login Implementation
	
	@Override
	@Transactional
	public boolean isUserPresent(String userEmail) {
		return (long) em
				.createQuery("select count(u.userId) from UserTable u where u.userEmail = :em ")
				.setParameter("em", userEmail)
				.getSingleResult() == 1 ? true : false;
	}
	
	@Override
	@Transactional
	public long findUserIdByEmailAndPassword(String userEmail, String userPass) {
		return (long) em
				.createQuery("select id from UserTable where userEmail = :em and userPass = :pw ")
				.setParameter("em", userEmail)
				.setParameter("pw", userPass)
				.getSingleResult();
	}
	
	//Finding User Object After Login (Dashboard Use)
	
	@Override
	@Transactional
	public UserTable findUserByUserID(long userId) {
		UserTable res = em.find(UserTable.class, userId);
		return res;
	}
	
	// Remove User By UserID
	
	@Override
	@Transactional
	public void removeUserByUserID(long userId) {
		UserTable user = em.find(UserTable.class, userId);
		em.remove(user);
	}
	
	
	// Create Account
	
	@Override
	@Transactional
	public String registerAccount(Account account) {
		Account a = em.merge(account);
		return a.getAccNumber();
	}
	
	@Override
	@Transactional
	public String registerVehicle(Vehicle vehicle) {
		Vehicle veh = em.merge(vehicle);
		return veh.getVehicleId();
	}	
	
	@Override
	@Transactional
	public boolean isVehiclePresent(String vehicleId) {
		return (long) em
				.createQuery("select count(v) from Vehicle v where v.vehicleId = :vid")
				.setParameter("vid", vehicleId)
				.getSingleResult() == 1 ? true : false;
	}
	
	
	// Apply Loan 
	
	@Override
	@Transactional
	public long registerLoan(Loan loan) {
		Loan l = em.merge(loan);
		return l.getLoanId();	}	
		
	
		
//----------------------------------------------------------------------
		
	// Admin Registration
	
	@Override
	@Transactional
	public long registerAdmin(Admin admin) {
		Admin a = em.merge(admin);
		return a.getAdminId();
	}

		
	// Admin Login
	
	@Override
	@Transactional
	public boolean isAdminPresent(String adminEmail) {
		return (long) em
				.createQuery("select count(adminId) from Admin where adminEmail = :email ")
				.setParameter("email", adminEmail)
				.getSingleResult() == 1 ? true : false;
	}

	@Override
	@Transactional
	public long findAdminIdByEmailAndPassword(String adminEmail, String adminPass) {
		return (long) em
				.createQuery("select id from Admin where adminEmail = :em and adminPass = :pw ")
				.setParameter("em", adminEmail)
				.setParameter("pw", adminPass)
				.getSingleResult();
	}

	@Override
	public Admin findAdminById(long adminId) {
		return em.find(Admin.class, adminId);
	}
			
		
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<UserTable> fetchAllRegisteredUsers() {
		return em
				.createNamedQuery("UserTable.findAll")
				.getResultList();
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Loan> fetchApplicationForm() {
		return em
				.createNamedQuery("Loan.findAll")
				.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Loan> allApprovedUsers() {
		return em
				.createQuery("select l from Loan l where l.applicationStatus = 'Approved'")
				.getResultList();
	}
		
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Loan> allPendingUsers() {
		return em
				.createQuery("select l from Loan l where l.applicationStatus = 'Pending'")
				.getResultList();
	}
		
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Loan> allRejectedUsers() {
		return em
				.createQuery("select l from Loan l where l.applicationStatus = 'Rejected'")
				.getResultList();
	}
		
	@Override
	@Transactional
	public void approveLoan(long loanId) {
		em.createQuery("update Loan l set l.applicationStatus = 'Approved' where l.loanId =:id ")
		.setParameter("id", loanId)
		.executeUpdate();
	}
	
	@Override
	@Transactional
	public void rejectLoan(long loanId) {
		em.createQuery("update Loan l set l.applicationStatus = 'Rejected' where l.loanId =:id ")
		.setParameter("id", loanId)
		.executeUpdate();
	}
	
	//-------------------------------------------------------------

	//Added these methods for loan

	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Loan> viewAllLoans() {
		return em
				.createNamedQuery("Loan.findAll")
				.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Loan> getLoanStatusByUserId(long userid) {
		return em.createQuery("select l from Loan l where l.user_id =:id ")
				.setParameter("id", userid)
				.getResultList();
	}

	@Override
	@Transactional
	public Loan getLoanById(long loanId) {
		return em.find(Loan.class, loanId);
	}

	@Override
	@Transactional
	public void removeLoanById(long loanId) {
		Loan loan = em.find(Loan.class, loanId);
		em.remove(loan);
	}

	@Override
	@Transactional
	public void removeLoanByApplicationStatus(String applicationStatus) {
		em
		.createQuery("delete from Loan where applicationStatus = :appStatus")
		.setParameter("appStatus", applicationStatus);
	}

	@Override
	@Transactional
	public Loan retrieveLoanByloanType(String loan) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	@Override
	public boolean doesAccountExist(String accNumber) {
		return (long) em
				.createQuery("select count(a.accNumber) from Account a where a.accNumber = :em ")
				.setParameter("em", accNumber)
				.getSingleResult() == 1 ? true : false;
	}
    
    
}
