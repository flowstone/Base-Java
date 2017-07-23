package me.xueyao01.cacl;


/**
 * 1. static引入（计算器需求）：
        1）创建一个Calculator计算器类，并在Calculator类中定义两个属性 price和color。
        2）在Calculator类中定义一个方法, getSum(); 求和功能.
        对比计算器类的 getSum() 求和方法和之前学生类的 introduce() 方法内部有什么区别 ?
    2. static修饰方法(静态方法):
        1. 在方法前面加关键字static
        2. 调用：类名.方法名()、 对象.方法名()
        3. 静态方法无法访问非静态属性, 静态方法不存在重写（因为静态和对象无关，只跟类有关）
        4. 应用：如果方法无需访问'成员变量'，那么该方法就应该被设计成静态方法。
 * @author Yao Xue
 * @date Jul 23, 2017 10:00:22 AM
 */
public class CaclDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.price = 100;
        c.color = "pink";
        
        int sum2 = c.getSum(1, 2);
        System.out.println(sum2);
        
        int sum = Calculator.getSum(2, 3);
        System.out.println(sum);
        
        CalcSon cs = new CalcSon();
        cs.getSum(2, 3);
    }
}

class Calculator {
    int price;
    String color;
    
    public static int getSum(int a, int b) {
        System.out.println("父类的方法");
        return a + b;
    }
    
    public void introduce() {
        System.out.println("我的颜色是"+color+"，价格是"+price);
        
    }
}

class CalcSon extends Calculator {
    public static int getSum(int a, int b) {
        System.out.println("的方法");
        Calculator.getSum(3, 4);
        return a + b;
    }
    
    public void speak() {
        getSum(3,3);
        Calculator.getSum(3, 4);
        super.getSum(3, 3);
    }
}
