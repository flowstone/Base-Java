package org.xueyao.work04;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 9:47:11 PM
 */
public class SportTeacher extends Teacher implements Sport{

    public SportTeacher(){}
    public SportTeacher(String name, int age) {
        super(name,age);
    }
    @Override
    public void playBasketball() {
        System.out.println("年龄为"+getAge()+"岁 "+getName()+" 老师在打篮球");
    }
    
}
