package me.xueyao.service;

public interface AccountService {
    /**
     * 业务层：转账方法
     * @param formId  转出账户id
     * @param toId  转入账户id
     * @param money  转账金额
     */
    public void transfer(Long formId, Long toId, Double money);

}
