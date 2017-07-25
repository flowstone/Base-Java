package org.xueyao12.finallyreturn;
/**
 * @author Yao Xue
 * @date Jul 24, 2017 4:03:18 PM
 */
public class FinallyReturnDemo {
    public static void main(String[] args) {
        boolean method = method();
        System.out.println(method);   //true
        
        int m2 = method2();
        System.out.println(m2);  //1
        
        Person m3 = method3();
        System.out.println(m3.age);  //3
    }

    private static Person method3() {
        Person p = new Person();
        try {
            p.age = 1; 
            return p;//这个值被 记录起来了，不是变量被记录起来(传值不传变量)
        } catch (Exception e) {
            // TODO: handle exception
            p.age = 2;
        } finally {
            p.age = 3;
            p = new Person();
            p.age = 4;
        }
        return p;
    }

    private static int method2() {
        int a = 1;
        try {
            return a;  //这个值被记录起来了，不是变量被记录起来（传值不传变量）
        } catch (Exception e) {
            // TODO: handle exception
            a = 2;
        } finally {
            a = 3;
            System.out.println(a);
        }
        System.out.println("没有执行");
        return a;
    }

    private static boolean method() {
       try {
           //return之后代码不执行(检测到后面还有finally,return 就会暂停执行，false)
           return false;
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            return true; //finally一定执行，新的return 覆盖了之前return
        }
    }
}

class Person {
    int age;
}
