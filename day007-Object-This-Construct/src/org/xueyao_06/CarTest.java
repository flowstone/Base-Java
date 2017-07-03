package org.xueyao_06;
/**
 * 汽车类测试
 * @author Yao Xue
 * @date Jul 3, 2017 4:21:09 PM
 */
public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        
        car.setBrand("一张大饼分四块");
        car.setPrice(9999);
        car.setColor("白色");
        
        System.out.println("小明有一辆车，品牌是"+car.getBrand()+",汽车的颜色是"+car.getColor()+
                ",花费了他几十年的工资,价格是"+car.getPrice()+"元");
        
        car.run();
    }
}
