package com.lti.pg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.lti.pg.beans.LoanApproval;

import org.springframework.stereotype.Repository;

@Repository("LoanApprovalDao")
public class LoanApprovalDaoImpl implements LoanApprovalDao {

    @PersistenceContext
	private EntityManager entityManager;

    @Override
    public List<LoanApproval> getList() {
        
        String sql = "SELECT l FROM LoanApproval l "; //-- just to reduce display
        Query qry = entityManager.createQuery(sql);		
        List<LoanApproval> LoanList = qry.getResultList();
        return LoanList;	
    }
    
}
