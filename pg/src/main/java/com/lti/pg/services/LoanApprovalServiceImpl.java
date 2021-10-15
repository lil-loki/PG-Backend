package com.lti.pg.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.pg.beans.LoanApproval;
import com.lti.pg.dao.LoanApprovalDao;

@Service
public class LoanApprovalServiceImpl implements LoanApprovalService {

    @Autowired
    private LoanApprovalDao loanApprovalDao;

    @Override
    public List<LoanApproval> getList() {
        
        return loanApprovalDao.getList();
    
    }    



}
