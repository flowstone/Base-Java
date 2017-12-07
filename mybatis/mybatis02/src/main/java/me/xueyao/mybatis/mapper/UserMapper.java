package me.xueyao.mybatis.mapper;

import me.xueyao.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author XueYao
 * @date 2017-12-07
 */
public interface UserMapper {
    /**
     * 查询指定id的用户
     * @param id 用户id
     * @return 用户对象
     */
    User queryUserById(Long id);

    /**
     * 根据表名查询用户
     * @param tableName 表名
     * @return 返回用户结果集
     */
    List<User> queryUsersByTableName(@Param("tableName") String tableName);

    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     * @return  用户对象
     */
    User login(@Param("userName") String username, @Param("password") String password);

    /**
     * HashMap 登录
     * @param user
     * @return
     */
    User loginMap(Map<String, Object> user);

    /**
     * 根据用户名模糊查询
     * @param username 用户名
     * @return 用户对象
     */
    List<User> queryUsersLikeUserName(@Param("userName") String username);

    /**
     * 查询男性用户，如果输入了用户名，按用户名模糊查询
     * @param username 用户名
     * @return 用户结果集
     */
    List<User> queryUserListLikeUserName(@Param("userName") String username);

    /**
     * 查询男性用户，如果输入了用户名则按照用户名模糊查找，否则如果输入了年龄则按照年龄查找，否则查找用户名为“zhangsan”的用户。
     * @param username 用户名
     * @param age 年龄
     * @return 用户结果集
     */
    List<User> queryUserListLikeUserNameOrAge(@Param("userName") String username, @Param("age") Integer age);

    /**
     * 查询所有用户，如果输入了用户名按照用户名进行模糊查询，如果输入年龄，按照年龄进行查询，如果两者都输入，两个条件都要成立。
     * @param username 用户名
     * @param age 年龄
     * @return  用户结果集
     */
    List<User> queryUserListLikeUserNameAndAge(@Param("userName") String username, @Param("age") Integer age);

    /**
     * 修改用户信息，如果User某个参数为null，则不修改
     * @param user 用户对象
     */
    void updateUserSelective(User user);

    /**
     * 根据多个id查询用户
     * @param ids 数组
     * @return 用户结果集
     */
    List<User> queryUserListByIds(@Param("ids") Long[] ids);
}
