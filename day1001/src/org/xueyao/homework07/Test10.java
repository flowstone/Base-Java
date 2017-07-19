package org.xueyao.homework07;
/**
 * 请使用代码描述: 45岁的大男孩李晨有一个20岁的女友(范冰冰),李晨在逛街(和范冰冰) 
 * @author Yao Xue
 * @date Jul 19, 2017 9:13:49 AM
 */
public class Test10 {
    public static void main(String[] args) {
        new Boy("李晨", 45, new Girl("范冰冰", 20)).walking();
    }
}


class Girl  {
    private String name;
    private int age;
    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
class Boy {
    private String name;
    private int age;
    private Girl girlFriend;
    public Boy(String name, int age, Girl girlFriend) {
        this.name = name;
        this.age = age;
        this.girlFriend = girlFriend;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Girl getGirlFriend() {
        return girlFriend;
    }
    public void setGirlFriend(Girl girlFriend) {
        this.girlFriend = girlFriend;
    }
    //45岁的大男孩李晨在和20岁的小女友范冰冰逛街
    public void walking() {
        System.out.println(age+"岁的大男孩"+name+"在和"+girlFriend.getAge()+"岁的小女友"+girlFriend.getName()+"逛街");
    }
    
}