package me.xueyao.level2_04;
/**
 * @author Yao Xue
 * @date Jul 24, 2017 12:16:21 PM
 */
public class Test {
    public static void main(String[] args) {
        try {
            login("ad", "123");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
    public static void login(String name,String pwd) throws LoginException {
        if (name !="admin") {
            throw new LoginException("用户名有存在");
        }
        if (pwd !="pwd") {
            throw new LoginException("密码错误");
        }
        if (name == "admin" && pwd == "admin") {
            System.out.println("欢迎"+name);
        }
    }
}
