package org.xueyao06.trycatchcatch;
/**
 * 4. 多个catch并行处理 :分类讨论
        0. 需求：设置一个方法,传递参数：如果传递是0,方法出现空指针异常,传递的非0,出现数组越界异常。并用try.catch.catch方式处理
        1. 语法:
             try{
            }catch(异常类  变量){
            
            }catch(异常类  变量){
            
            }
        2. 应用前提: 多个catch中的异常类之间,没有继承关系,平级异常。
          1. 判断如下继承体系中NullPointerException和ArrayIndexOutOfBoundsException是什么关系？平级关系
            Exception
             |-- RuntimeException  动物
                |-- NullPointerException 猫
                |-- IndexOutOfBoundsException 狗
                  |-- ArrayIndexOutOfBoundsException 军犬
         3. 多个catch之间异常类,有继承关系
            1. 如果父类写前面，后面的子类异常永远执行不到，报错
            2. 如果子类写前面，则有可能执行到后面的父类异常，不报错
 * @author Yao Xue
 * @date Jul 24, 2017 2:42:27 PM
 */
public class TryCatchCatchDemo {
    public static void main(String[] args) {
        //method(0);
        try {
            //如果代码永远执行不到，就是废代码，编译报错
            method(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界异常被处理了");
        } catch (NullPointerException e) {
            // TODO: handle exception
        }
    }

    //设置一个方法，传递参数：如果传递是0，方法出现空指针异常，传递的非0，出现数组越界异常
    private static void method(int i) {
        if (i == 0) {
            //java.lang.NullPointerException 空指针异常
            String s = null;
            System.out.println(s.length());
        } else {
            int[] array = new int[0];
            System.out.println(array[1]);
        }
    }
}
