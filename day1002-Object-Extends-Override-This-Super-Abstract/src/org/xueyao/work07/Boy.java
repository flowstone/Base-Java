package org.xueyao.work07;
/**
 * 4. 定义Boy类,继承Person类
    a)  成员变量
    i.  女朋友 (girlFriend)
    b)  成员方法: 
    i.  重写父类的  void say(String content) 方法
    输出格式:容紫英用带有阳刚之气的声音对欧阳青青说:我会守护你一生一世
    ii. 特有方法: 散步 walking() 
    输出格式: 慕容紫英和欧阳青青在河边的林荫小道上手牵着手散步
    c)  要求:
    i.  提供无参和带参构造
    iii.    提供setXxx和getXxx方法

 * @author Yao Xue
 * @date Jul 19, 2017 9:11:18 PM
 */
public class Boy extends Person{

    private Girl GirlFried;
    
    public Boy() {
        super();
    }

    public Boy(String name, int age, double height, Girl GirlFried) {
        super(name, age, height);
        this.GirlFried = GirlFried;
    }

    public Girl getGirlFried() {
        return GirlFried;
    }

    public void setGirlFried(Girl girlFried) {
        GirlFried = girlFried;
    }

    @Override
    public void say(String content) {
        System.out.println(getName()+"用带有阳刚之气的声音对"+GirlFried.getName()+"说:"+content);
    }
    
    public void walking() {
        System.out.println(getName()+"和"+GirlFried.getName()+"在河边的林荫小道上手牵着手散步");
    }

}
