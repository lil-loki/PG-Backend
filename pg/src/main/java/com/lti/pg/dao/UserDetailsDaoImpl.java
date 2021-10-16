package com.lti.pg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.lti.pg.beans.UserDetails;

import org.springframework.stereotype.Repository;


@Repository("UserDetailsDao")
public class UserDetailsDaoImpl implements UserDetailsDao {

    @PersistenceContext
	private EntityManager entityManager;

    @Override
    public List<UserDetails> getList() {

        String sql = "SELECT u FROM UserDetails u "; 
        Query qry = entityManager.createQuery(sql);		
        List<UserDetails> details = qry.getResultList();
        return details;
    }
    
}
