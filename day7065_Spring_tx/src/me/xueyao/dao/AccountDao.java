package me.xueyao.dao;

import me.xueyao.domain.Account;

public interface AccountDao {
    
    /**
     * 根据id查询账户对象
     * @param id
     * @return
     */
    public Account findById(Long id);
    
    /**
     * 更新账户对象
     * @param account
     */
    public void update(Account account);
    
    
}
