package org.xueyao.work04;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 9:51:52 PM
 */
public class SportStudent extends Student implements Sport{

    public SportStudent(){}
    public SportStudent(String name, int age) {
        super(name, age);
    }
    @Override
    public void playBasketball() {
         System.out.println("年龄为"+getAge()+"岁 "+getName()+" 学生在打篮球");   
    }

}
