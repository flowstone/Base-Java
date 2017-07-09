package com.itheima.cn;

import java.util.ArrayList;

/**
 * 1.定义"军人"类,Soldier,包含以下成员: 

成员属性: name (姓名):String类型，age (年龄):int类型，like (爱好):String类型，属性使用private修饰。 

成员方法: 

        1).get/set方法 

        2).show()方法,打印对象所有属性的值; 

2.定义类：Test05,类中定义main()方法，按以下要求编写代码: 

   2.1分别实例化三个Soldier对象，三个对象分别为："王小兵" ,25,”打篮球”、"李团长" ,35,”游泳”、"王军长" ,55,”踢足球”; 

   2.2创建一个ArrayList集合，这个集合里面存储的是Solider类型，分别将上面的三个Solider对象添加到集合中 

   2.3遍历这个集合，在遍历的过程中，如果这个集合里面中有对象的年龄大于40，那么将集合中这个对象的爱好改成”打高尔夫”
   ，然后调用这个对象的show方法展示这个对象所有的属性信息 
 * @author Yao Xue
 * @date Jul 9, 2017 6:28:19 PM
 */
public class Test16 {
    public static void main(String[] args) {
        Soldier s1 = new Soldier();
        s1.setName("王小兵");
        s1.setAge(25);
        s1.setLike("打篮球");
        
        Soldier s2 = new Soldier();
        s2.setName("李团长");
        s2.setAge(35);
        s2.setLike("游泳");
        
        Soldier s3 = new Soldier();
        s3.setName("王军长");
        s3.setAge(55);
        s3.setLike("踢足球");
        
        ArrayList<Soldier> arrayList = new ArrayList<Soldier>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        
        for (int i = 0; i < arrayList.size(); i++) {
            Soldier soldier = arrayList.get(i);
            if (soldier.getAge() > 40) {
                soldier.setLike("打高尔夫");
                arrayList.set(i, soldier);
                soldier.show();
            }
        }
    }
}
