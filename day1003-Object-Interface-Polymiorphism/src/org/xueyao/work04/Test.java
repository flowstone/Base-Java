package org.xueyao.work04;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 9:53:37 PM
 */
public class Test {
    public static void main(String[] args) {
        SportTeacher sp = new SportTeacher("周晓斌",30);
        SportStudent ss = new SportStudent("叶知秋",18);
        
        goToSport(sp);
        goToSport(ss);
        
        goToRestaurant(sp);
        goToRestaurant(ss);
    }
    
    public static void goToSport(Sport s) {
        s.playBasketball();
    }
    
    public static void goToRestaurant(Person p) {
        p.eat();
    }
}
