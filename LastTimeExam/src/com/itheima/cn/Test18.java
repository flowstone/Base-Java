package com.itheima.cn;
/**
 * ��.(1)���������ַ�������{"010","3223","666","7890987","123123"} 
(2)�жϸ������ַ��������е������ַ����Ƿ��ǶԳ�(��һ�����ֺ����һ��������ȣ��ڶ������ֺ͵����ڶ�����������ȵģ���������)�ģ��������� 
�磺010 �ǶԳƵģ�3223 �ǶԳƵģ�123123 ���ǶԳƵġ�
 * @author Yao Xue
 * @date Jul 9, 2017 6:47:26 PM
 */
public class Test18 {
    public static void main(String[] args) {
        String[] str = {"010","3223","666","7890987","123123"} ;
        String[] strings = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            strings[i]  = str[i];
            //���ʹ��StringBuilder�еķ�ת�����������ԭ�ַ������ݸı䣬Ϊ�˱Ƚϣ�����Ҫ��ԭ�������ݱ��浽һ���µ��ַ��У��Ա�Ƚ�
            StringBuilder stringBuilder = new StringBuilder(str[i]);
            
            if (strings[i].contentEquals(stringBuilder.reverse())) {
                System.out.println(strings[i]+" �ǶԳƵ�");
            } else {
               System.out.println(strings[i]+" ���ǶԳƵ�");
            }
        }
    }
}
