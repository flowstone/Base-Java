package me.xueyao07.regex;
/**
 * 1. Regex：正则表达式是用字符串写成的一种规则
    2. String类的方法matches匹配规则
        1.  案例：检查QQ号码是否合法,规则: 必须全数字,不能0开头,最低5位,最高12位
        2.  案例：检查手机号码是否合法,规则：必须1开头,第二位: 34578，全数字,总共11位
    3. String类的方法split
        1. 案例：切割字符串，返回数组
        2. 案例：切割网络ip
 * @author Yao Xue
 * @date Jul 26, 2017 2:07:29 AM
 */
public class RegexDemo {
    public static void main(String[] args) {
        splitIp();
        split();
        checkNum();
        checkQQ();
    }

    private static void checkQQ() {
        //1.案例：检查QQ号码是否合法,规则: 必须全数字,不能0开头,最低5位,最高11位
        String s = "12345678901";
        boolean matches = s.matches("[1-9][0-9]{4,10}");
        System.out.println(matches);
    }

    private static void checkNum() {
        // 2.  案例：检查手机号码是否合法,规则：必须1开头,第二位: 34578，全数字,总共11位
        String num = "13800138001";
        boolean matches = num.matches("[1][34578][0-9]{9}");
        System.out.println(matches);
    }

    private static void split() {
        String[] split = "ab,cd,ed,gh,,,ij".split(",+");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
            
        }
    }

    private static void splitIp() {
        String ip = "192.168.1.188";
        //转义字符:将内容的原有含义覆盖掉
        String[] split = ip.split("\\.");
        
        System.out.println("haha");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
            
        }
    }
}
