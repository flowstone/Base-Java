package org.xueyao.work01;
/**
 * @author Yao Xue
 * @date Jul 24, 2017 7:43:10 PM
 */
public class Test10 {
    public static void main(String[] args) {
        //testThrows();
    }
    
    public static char charAt(String str, int index) throws Exception {
        if (null == str) {
            throw new Exception("字符串不能为null");
        }
        
        if (str.equals("")) {
            throw new Exception("字符串不能为空");
            
        }
        
        if (index < 0 || index >= str.length()) {
            throw new Exception("索引越界"+index);
        }
        return str.charAt(index);
    }
    
    public static void testThrows() throws Exception {
        char c;
        c = charAt(null, 0);
        System.out.println(c);
    }
}
