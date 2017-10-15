package me.xueyao.dao;

public interface UserDao {

    /**
     * 持久层：用户保存
     */
    public void save();
    
    /**
     * 持久层：用户删除
     * @return
     */
    public Integer delete();
    
    /**
     * 持久层：用户更新
     */
    public void update();
    
    /**
     * 持久层：用户查询 
     */
    public void list();
}
