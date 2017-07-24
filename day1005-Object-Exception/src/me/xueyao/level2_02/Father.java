package me.xueyao.level2_02;
/**
 * @author Yao Xue
 * @date Jul 23, 2017 9:17:48 PM
 */
public class Father {
    public void eat() throws ToothPainException {
        System.out.println("吃到一个石子");
        throw new ToothPainException();
    }
    
    public void drink() {
        System.out.println("喝什么都没有问题");
    }
}
