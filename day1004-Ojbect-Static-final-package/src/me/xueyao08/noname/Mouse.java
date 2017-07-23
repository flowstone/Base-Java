package me.xueyao08.noname;
/**
 * @author Yao Xue
 * @date Jul 23, 2017 11:29:32 AM
 */
public class Mouse implements USB {

    @Override
    public void open() {
        System.out.println("mouse is open...");
    }

    @Override
    public void close() {
        System.out.println("mouse is close...");
    }
    
}
