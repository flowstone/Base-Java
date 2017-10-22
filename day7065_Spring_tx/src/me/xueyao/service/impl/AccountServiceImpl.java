package me.xueyao.service.impl;

import me.xueyao.dao.AccountDao;
import me.xueyao.service.AccountService;

public class AccountServiceImpl implements AccountService {
    
    private AccountDao AccountDao;
    
    public AccountDao getAccountDao() {
        return AccountDao;
    }

    @Override
    public void transfer(Long formId, Long toId, Double money) {
        //查询转出账户
        
        //查询转入账户
        
        //转出账户减钱
        
        //转入的账户加钱
        
        //更新转出账户
        
        //更新转入账户
    }

}
