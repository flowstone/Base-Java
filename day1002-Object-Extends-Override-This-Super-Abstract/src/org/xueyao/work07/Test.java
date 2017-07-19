package org.xueyao.work07;
/**
 * 定义测试类Test
    a)  提供main方法
    b)  在main方法中
    i.  创建衣服对象 c,品牌初始化为李宁,颜色初始化为白色
    ii. 创建女孩对象 girl,姓名赋值为欧阳青青,年龄赋值为18,身高赋值为1.6,脸型赋值为瓜子脸
    iii.    创建男孩对象 boy,姓名赋值为慕容紫英,年龄赋值以为20,身高赋值1.75,女朋友赋值为girl
    iv. 调用对象girl的洗衣服方法
    v.  调用对象boy的散步方法
    vi. 调用对象boy的说话方法,传入:”我会守护你一生一世”
    vii.    调用对象 girl 的说话方法,传入:  “有你在我就安心.”


 * @author Yao Xue
 * @date Jul 19, 2017 9:14:46 PM
 */
public class Test {
    public static void main(String[] args) {
        Clothes c = new Clothes("白色", "李宁");
        Girl girl = new Girl("欧阳青青", 18, 1.6,"瓜子脸");
        Boy boy = new Boy("慕容紫英", 20, 1.75, girl);
        
        girl.wash(c);
        boy.walking();
        boy.say("我会守护你一生一世");
        girl.say("有你在我就安心.");
        
    }
}
