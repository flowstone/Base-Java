package org.xueyao.work09;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 9:47:53 PM
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car(4, "白色");
        car.run();
        car.work();
        
        Bike bike = new Bike(2, "红色");
        bike.run();
        bike.work();
    }
}
