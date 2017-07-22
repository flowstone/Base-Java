package org.xueyao.work02;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 8:28:51 PM
 */
public class Final_2 {
    public final void finalMethod() {
        
    }
    
    public void normalMethod() {
        
    }
}

class Sub2 extends Final_2 {
    /*final修饰方法不能被覆盖(重写)
     * public final void finalMethod() {
        
        }
    */
    
    //父类中没有被fianl修饰方法，子类覆盖后可以加final
    public final void normalMethod() {
        
    }
    
}
