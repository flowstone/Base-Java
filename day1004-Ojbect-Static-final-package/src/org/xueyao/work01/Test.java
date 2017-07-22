package org.xueyao.work01;

import org.xueyao.work01.Car.Engine;

/**
 * @author Yao Xue
 * @date Jul 22, 2017 8:15:02 PM
 */
public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        
        Engine e = c.new Engine();
        e.work();
        
        c.setStatus(true);
        e.work();
    }
}
