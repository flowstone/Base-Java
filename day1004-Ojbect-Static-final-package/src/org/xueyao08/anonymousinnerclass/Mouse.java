package org.xueyao08.anonymousinnerclass;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 12:00:01 PM
 */
public class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("Mouse open");
    }

    @Override
    public void close() {
        System.out.println("Mouse close");
    }

}
