package org.xueyao.dynamic.proxy;
/**
 * @author Yao Xue
 * @date Aug 16, 2017 12:35:32 PM
 */
public class LiuYan implements SuperStar{

    @Override
    public void sing(int money) {
        System.out.println("唱了一首<<真的爱你>>");
        System.out.println("赚了:"+money + "元");
    }

    @Override
    public void liveShow(int money) {
        System.out.println("参加了Running Man节目");
        System.out.println("赚了:"+money+"元");
    }

    @Override
    public void sleep() {
        System.out.println("好累,休息一下,马上回来...");
    }

}
