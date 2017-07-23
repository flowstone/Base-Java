package org.xueyao08.anonymousinnerclass;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 11:57:45 AM
 */
public class Computer {
    private String CUP;
    private int memory;
    private int harddisk;
    
    public void run() {
        System.out.println("Computer run");
    }
    
    public void useUSB(USB usb) {
        if (usb != null) {
            usb.open();
            usb.close();
        }
    }
}
