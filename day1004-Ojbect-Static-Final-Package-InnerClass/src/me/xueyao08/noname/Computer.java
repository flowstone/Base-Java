package me.xueyao08.noname;
/**
 * @author Yao Xue
 * @date Jul 23, 2017 11:28:10 AM
 */
public class Computer {
    void powerOn() {
        
    }
    
    void powerOff() {
        
    }
    
    //定义一个规范，让这个笔记本使用这个规范，进行功能扩展
    void useUSB(USB usb) {
        usb.open();
        usb.close();
    }
}
