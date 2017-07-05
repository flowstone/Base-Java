package org.xueyao.homework;


/**
 * 第一题：分析以下需求，并用代码实现
    1.定义如下方法public static String getPropertyGetMethodName(String property)
        功能描述:
            (1)该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的get方法的名字
            (2)如：用户调用此方法时给定的参数为"name",该方法的返回值为"getName"
    2.定义如下方法public static String getPropertySetMethodName(String property)
        功能描述:
            (1)该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的set方法的名字
            (2)如：用户调用此方法时给定的参数为"name",该方法的返回值为"setName"
 * @author Yao Xue
 * @date Jul 5, 2017 4:30:04 PM
 */
public class HomeWork_01 {
    public static void main(String[] args) {
        String variable = "name";
        String getMethod = getPropertyGetMethodName(variable);
        System.out.println(getMethod);
        String setMethod = getPropertySetMethodName(variable);
        System.out.println(setMethod);
    }
    
    public static String getPropertyGetMethodName(String property) {
        String getStr = "get";
        String first = property.substring(0,1).toUpperCase();
        String other = property.substring(1,property.length()).toLowerCase();
        getStr += first + other;
        return getStr;
        
    }
    
    public static String getPropertySetMethodName(String property) {
        String setStr = "set";
        String first = property.substring(0,1).toUpperCase();
        String other = property.substring(1,property.length()).toLowerCase();
        setStr += first + other;
        return setStr;
        
    }
    
}
