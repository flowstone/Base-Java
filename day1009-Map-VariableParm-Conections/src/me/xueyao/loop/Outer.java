package me.xueyao.loop;
/**
 * @author Yao Xue
 * @date Jul 29, 2017 3:27:07 PM
 */
public interface Outer {
    int I = 3;
    void outerMethod();
    
    //默认public Static
    interface Inner {
        void innerMethod();
    }
}
