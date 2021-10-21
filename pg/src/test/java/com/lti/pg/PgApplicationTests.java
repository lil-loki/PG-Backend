package com.lti.pg;

import java.sql.Date;
import java.util.List;

import com.lti.pg.beans.*;
import com.lti.pg.dao.DaoLayerImpl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
class PgApplicationTests {

	@Autowired
	private DaoLayerImpl repo;
	
	@Test
	void getLoanStatus() {
		System.out.println(repo.getLoanStatusByUserId(0));}
	

	

	@Test
	void getAllRegisteredUsers() {
		List<UserTable> list = repo.fetchAllRegisteredUsers();
		System.out.println(list.toString());
	}
	
	@Test
	void reject() {
		repo.rejectLoan(1);
	}
	
		@Test
		void approve() {
			repo.approveLoan(1);
		}
	

	

	@Test
	void registerUser() {

		UserTable user=new UserTable();
		user.setUserId(2);
		user.setUserNameFirst("Min");
		user.setUserNameLast("Yoongi");
		user.setUserNameMiddle("");
		user.setUserAge(26);
		user.setUserGender("Male");
		user.setUserAddress("Daegu, South Korea");
		user.setUserEmail("minyoongi@gmail.com");
		user.setUserPass("yoonmin");
		user.setUserZip("262405");
		user.setUserType("New");
		repo.registerUser(user);
	}
	

//	
//-------------------------------------------------------------
//ADMIN OPERATIONS
//	
//	
	@Test
	void registerAdmin() {
		Admin admin = new Admin();
		admin.setAdminId(1001);
		admin.setAdminEmail("kavaK@gmail.com");
		admin.setAdminNameFirst("KavitaJi");
		admin.setAdminNameLast("Karki");
		admin.setAdminGender("Female");
		admin.setAdminPass("abcd1234");
		admin.setAdminAge(21);
		System.out.println(repo.registerAdmin(admin));
	}
//	
//----------------------------------------------------------------
// ACCOUNT OPERATIONS!
// 
//
	@Test
	void registerAccount() {
		Account account= new Account();
		account.setAccNumber("DCYGR234235");
		account.setAccBankName("HDFC");
		account.setAccIfsc("HDF1344");
		account.setAccType("Corporate");
		account.setSalary(50000);
		account.setExisitingEmi(2);
		account.setUserEmploymentType("Salaried");
		account.setMonthlySavings(20000);
		System.out.println(repo.registerAccount(account));
	}
//	
//----------------------------------------------------------------
//LOAN OPERATIONS!
//
//
	@Test
	void registerLoan() {
		Loan loan=new Loan();
		loan.setLoanId(2);
		loan.setLoanAmount(50000);
		loan.setInterestRate(9);
		loan.setProcessingFee(100);
		loan.setEmi(5000);
		loan.setTenure(36);
		loan.setApplicationStatus("Pending");
		loan.setLoanStatus("New");
		loan.setLoanStartDate(Date.valueOf("2018-09-12"));
		loan.setLoanEndDate(Date.valueOf("2021-09-12"));
		System.out.println(repo.registerLoan(loan));
	}
//
//----------------------------------------------------------------

			//VEHICLE OPERATIONS
		@Test
		void registerVehicle() {
			Vehicle vehicle=new Vehicle();
			vehicle.setVehicleId("21234164");
			vehicle.setVehicleModel("VXI");
			vehicle.setVehicleType("Car");
			vehicle.setVehicleYear(700000);
			vehicle.setVehicleColour("Navy Blue");
			vehicle.setExShowroomPrice(700000);
			vehicle.setOnRoadPrice(760000);
			System.out.println(repo.registerVehicle(vehicle));
		}
	}


	
// //	@Test
// //	void findUserIdbyEmailandPass() {
// //		long id = repo.findUserIdByEmailAndPassword("babyg@gmail.com", "Aditya@123yoonmin");
// //		System.out.println("the user id is: " +id);
// //	}
	
// 	//-------------------------------------------------------------
// 	//ADMIN OPERATIONS
	
	
// 	@Test
// 	void registerAdmin() {
// 		Admin admin = new Admin();
// 		admin.setAdminId(1001);
// 		admin.setAdminEmail("kavaK@gmail.com");
// 		admin.setAdminNameFirst("KavitaJi");
// 		admin.setAdminNameLast("Karki");
// 		admin.setAdminGender("Female");
// 		admin.setAdminPass("abcd1234");
// 		admin.setAdminAge(BigDecimal.valueOf(21));
// 		System.out.println(repo.registerAdmin(admin));
// 	}
	
	
// 	@Test
// 	void registerAccount() {
// 		Account account= new Account();
// 		account.setAccNumber("DCYGR234235");
// 		account.setAccBankName("HDFC");
// 		account.setAccIfsc("HDF1344");
// 		account.setAccType("Corporate");
// 		account.setSalary(BigDecimal.valueOf(50000));
// 		account.setExisitingEmi(BigDecimal.valueOf(2));
// 		account.setUserEmploymentType("Salaried");
// 		account.setMonthlySavings(BigDecimal.valueOf(20000));
// 		System.out.println(repo.registerAccount(account));
// 	}
// //	
// 	@Test
// 	void registerLoan() {
// 		Loan loan=new Loan();
// 		loan.setLoanId(1);
// 		loan.setLoanAmount(50000);
// 		loan.setInterestRate(9);
// 		loan.setProcessingFee(1000);
// 		loan.setEmi(5000);
// 		loan.setTenure(36);
// 		loan.setApplicationStatus("Complete");
// 		loan.setLoanStatus("New");
// 		loan.setLoanStartDate(Date.valueOf("2018-09-12"));
// 		loan.setLoanEndDate(Date.valueOf("2021-09-12"));
// 		loan.setLoantype("Two-Wheeler");
// 		System.out.println(repo.registerLoan(loan));
// 	}


// 	@Test
// 	void registerVehicle() {
// 		Vehicle vehicle=new Vehicle();
// 		vehicle.setVehicleId(21234164);
// 		vehicle.setVehicleMake("Maruti Suzuki Swift");
// 		vehicle.setVehicleModel("VXI");
// 		vehicle.setVehicleType("Car");
// 		vehicle.setVehicleYear(BigDecimal.valueOf(700000));
// 		vehicle.setVehicleColour("Navy Blue");
// 		vehicle.setExShowroomPrice(BigDecimal.valueOf(700000));
// 		vehicle.setOnRoadPrice(BigDecimal.valueOf(760000));
// 		System.out.println(repo.registerVehicle(vehicle));
// 	}
// }
