package org.xueyao03.interfaced;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 9:47:08 AM
 */
public class InterfaceDemo02 {
    public static void main(String[] args) {
        //1.创建一个Auntie类的对象
        //调用方式一  面对的是aunt对象
        Auntie aunt = new Auntie();
        aunt.feedTheBaby();
        aunt.coaxTheBabyToSleep();
        aunt.changeTheDiaper();
        aunt.laugh();
        
        System.out.println("----------");
        
        //调用方式二  面对的是接口
        //接口类型可以存放任何实现该接口类型对象的引用 
        GoodBabySitter babySitter = new Auntie();
        babySitter.feedTheBaby();
        babySitter.coaxTheBabyToSleep();
        babySitter.changeTheDiaper();
        
        //babySitter.teachBabyToSing(); //错误!找不到方法
        //BabySitter sitter = new BabySitter();  //错误，不能实例化
        
        Singable s = new Auntie();
        s.teachBabyToSing();
        s.laugh();   
        
        System.out.println("BabySitter.ID="+BabySitter.ID);
        System.out.println("Singable.ID="+Singable.ID);
    }
}
