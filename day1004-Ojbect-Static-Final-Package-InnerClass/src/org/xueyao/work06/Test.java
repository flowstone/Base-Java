package org.xueyao.work06;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 9:57:51 PM
 */
public class Test {
    public static void main(String[] args) {
        eatFood(new Feed("宠物1","tom") {
            
            @Override
            public void eat() {
                System.out.println(getBreed()+"叫"+getName()+"吃鱼");

            }
        });
        
        eatFood(new Feed("宠物2","小黑") {
            
            @Override
            public void eat() {
                System.out.println(getBreed()+"叫"+getName()+"啃骨头");
            }
        });
    }
    public static void eatFood(Feed f) {
        f.eat();
    }
}
