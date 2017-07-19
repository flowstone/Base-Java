package org.xueyao.homework07;
/**
 * ��ʹ�ô�������: 45��Ĵ��к����һ��20���Ů��(������),��ڹ��(�ͷ�����) 
 * @author Yao Xue
 * @date Jul 19, 2017 9:13:49 AM
 */
public class Test10 {
    public static void main(String[] args) {
        new Boy("�", 45, new Girl("������", 20)).walking();
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
    //45��Ĵ��к���ں�20���СŮ�ѷ��������
    public void walking() {
        System.out.println(age+"��Ĵ��к�"+name+"�ں�"+girlFriend.getAge()+"���СŮ��"+girlFriend.getName()+"���");
    }
    
}