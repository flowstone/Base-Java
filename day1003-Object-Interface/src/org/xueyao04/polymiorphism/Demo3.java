package org.xueyao04.polymiorphism;
/**
 * 多态的弊端
 * @author Yao Xue
 * @date Jul 21, 2017 10:35:04 AM
 */
public class Demo3 {
    public static void main(String[] args) {
        Person p = new Doctor();
        p.setName("女医生");
        
        Person p1 = new Actress();
        p1.setName("女演员");
        
        Person p2 = new Barber();
        p2.setName("理发师");
        cut(p2);
    }
    
   
    //Person听到了cut需要做的事情
    public static void cut(Person p) {
        p.doSomething();
        
        //如何调用子类私有的方法？
        //需要根据传入的不同对象，进行不同对象的强制类型转换
        //Doctor d = (Doctor)p;
        //d.temptationOfUniforms();
        
        //Actress a = (Actress)p;
        //a.beFamous();
        
        //Barber b = (Barber)p;
        //b.chasingGirls();
        
        //如何调用子类私有的方法？
        //需要根据传入的不同对象，进行不同对象的 强制类型转换
        if (p instanceof Barber) {
            Barber b = (Barber)p;
            b.chasingGirls();
        } else if (p instanceof Actress) {
            Actress a = (Actress)p;
            a.beFamous();
        } else if (p instanceof Doctor) {
            Doctor d = (Doctor)p;
            d.temptationOfUniforms();
        }
    }
    
    
}

