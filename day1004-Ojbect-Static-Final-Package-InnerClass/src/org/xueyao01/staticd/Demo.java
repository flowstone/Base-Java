package org.xueyao01.staticd;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 10:24:37 AM
 */
public class Demo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        
        c.setColor("粉色");
        c.setPrice(20);
        
        System.out.println("color:"+c.getColor()+",price:"+c.getPrice());
        
        int sum = c.getSum(10, 20);
        System.out.println("sum="+sum);
    }
}
