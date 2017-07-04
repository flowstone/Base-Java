package org.xueyao.homework;
/**
 * @author Yao Xue
 * @date Jul 4, 2017 8:52:06 AM
 */
class Person{

    public Person(){
        System.out.println("我是Person的空参构造");
    }

    public Person(String  msg){
        System.out.println("我是Person有参构造，参数值是：" + msg);
    }


    public void method5( ){
        System.out.println("我是method5方法。。。");
    }

    public void method6(int[] arr){
        System.out.println("arr[0]=" + arr[0]);
        System.out.println("arr[2]=" + arr[2]);
    }

    public double method2(int  num){
        System.out.println("method1方法执行了");
        return 2.0 * num;
    }

    public int[] method3(){
        int[] arr = new int[3];
        arr[1] = 100;
        return arr;
    }

    public void method12( Person  p){
        System.out.println("我是method12");
        p.method5( );
    }
}