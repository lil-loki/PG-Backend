package com.lti.pg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.pg.beans.UserDetails;
import com.lti.pg.dao.UserDetailsDao;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDetailsDao userDetailsDao;

    @Override
    public List<UserDetails> getList() {
        
        return userDetailsDao.getList();
    
    }    
}
