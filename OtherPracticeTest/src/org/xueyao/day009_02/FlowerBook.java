package org.xueyao.day009_02;
/**
 * @author Yao Xue
 * @date Jul 18, 2017 11:48:41 AM
 */
public class FlowerBook {
    public static void main(String[] args) {
        岳不群 小岳 = new 岳不群();
            小岳.自宫(); 
    }
}

abstract class 葵花宝典 {
    public abstract void 自宫();
}

class 岳不群 extends 葵花宝典 {

    @Override
    public void 自宫() {
        // TODO Auto-generated method stub
        System.out.println("用牙签");
    }
    
}

class 林平之 extends 葵花宝典 {

    @Override
    public void 自宫() {
        // TODO Auto-generated method stub
        System.out.println("用指甲刀");
    }
    
}

class 东方不败 extends 葵花宝典 {

    @Override
    public void 自宫() {
        // TODO Auto-generated method stub
        System.out.println("用锤子");
    }
    
}