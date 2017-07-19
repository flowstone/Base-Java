package org.xueyao.homework01;
/**" 请用代码描述: 周杰伦正在演唱菊花台歌曲(使用匿名对象)
1.定义Person类
  a)属性: 姓名(name)
  b)行为: 唱歌(void sing(String song))
  c)要求： 提供带参构造方法
2.定义测试类Test
 a)提供main方法
 b)在main方法中
   i.使用带参构造创建Person对象,把name赋值为周杰伦
  ii.使用上面创建的匿名对象调用唱歌的方法;唱歌的方法输出格式为
     周杰伦正在演唱菊花台歌曲"

 * @author Yao Xue
 * @date Jul 18, 2017 8:53:17 PM
 */
public class Test3 {
    public static void main(String[] args) {
        new Person("周杰伦").sing("菊花台");
    }
}

/*
 * 1.定义Person类
  a)属性: 姓名(name)
  b)行为: 唱歌(void sing(String song))
  c)要求： 提供带参构造方法
*/
class Person {
    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }
    //周杰伦正在演唱菊花台歌曲
    public void sing(String song) {
        System.out.println(name+"正在演唱"+song+"歌曲");
    }
}
