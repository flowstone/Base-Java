package org.xueyao.work04;
/**
 * 4. 定义Test类   
    a)  提供main方法
    b)  在main方法中
    i.  创建演员对象a,并把名称赋值为”景甜”,年龄赋值为18
    ii. 调用演员对象a的吃饭方法
    iii.    调用演员对象a的跳舞方法
    iv. 创建歌手对象 s,并把姓名赋值为”薛之谦”,年龄赋值为30.
    v.  调用歌手对象 s 的吃饭方法
    vi. 调用歌手对象 s 的唱歌方法

 * @author Yao Xue
 * @date Jul 19, 2017 8:35:48 PM
 */
public class Test {
    public static void main(String[] args) {
        Actor a = new Actor("景甜", 18);
        a.eat();
        a.dance();
        
        Singer s = new Singer("薛之谦", 30);
        s.eat();
        s.sing();
    }
}
