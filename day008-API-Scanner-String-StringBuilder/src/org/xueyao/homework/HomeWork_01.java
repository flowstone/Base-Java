package org.xueyao.homework;


/**
 * ��һ�⣺�����������󣬲��ô���ʵ��
    1.�������·���public static String getPropertyGetMethodName(String property)
        ��������:
            (1)�÷����Ĳ���ΪString���ͣ���ʾ�û������ĳ�Ա���������֣�����ֵ����ΪString���ͣ�����ֵΪ��Ա������Ӧ��get����������
            (2)�磺�û����ô˷���ʱ�����Ĳ���Ϊ"name",�÷����ķ���ֵΪ"getName"
    2.�������·���public static String getPropertySetMethodName(String property)
        ��������:
            (1)�÷����Ĳ���ΪString���ͣ���ʾ�û������ĳ�Ա���������֣�����ֵ����ΪString���ͣ�����ֵΪ��Ա������Ӧ��set����������
            (2)�磺�û����ô˷���ʱ�����Ĳ���Ϊ"name",�÷����ķ���ֵΪ"setName"
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
