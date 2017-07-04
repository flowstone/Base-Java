package org.xueyao.homework;
/**
 * 第一题：分析以下需求，并用代码实现
    动物类:
    属性:年龄
    行为:喝水,吃东西(吃什么不确定)
    游泳接口:
    行为:游泳方法
    狗类:
    行为:吃饭(啃骨头)和 游泳(狗刨)
    羊类:
    行为:吃饭(羊啃草)
    青蛙类:
    行为:吃饭(吃虫子)和 游泳(蛙泳)
    饲养员类:
    行为:饲养动物:包括吃饭和喝水
    测试类:
    创建饲养员对象,饲养员调用三次饲养方法:饲养狗,饲养羊,饲养青蛙
    要求: 
        1.子类重写父类中的吃东西方法
        2.要求给狗和青蛙添加游泳的方法(实现游泳接口)
        2.饲养员类中定义一个方法,传入动物类对象(父类),使用instanceof转换成子类,
        调用吃饭方法,如果有游泳方法也需进行测试
    
    打印如下格式的结果:
    狗喝水
    狗啃骨头
    狗会狗刨游泳
    
    青蛙喝水
    青蛙吃小虫
    青蛙会蛙泳
    
    羊喝水
    羊啃草

 * @author Yao Xue
 * @date Jul 3, 2017 4:32:10 PM
 */
public class Animal {
    private int age;
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void drinkWater() {
        System.out.println("喝水");
    }
    
    public void eat() {
        
    }
    
}
