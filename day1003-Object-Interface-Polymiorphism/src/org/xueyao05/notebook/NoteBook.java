package org.xueyao05.notebook;
/**
 * @description 笔记本类，包含运行功能、关机功能、使用USB设备功能
 * @author Yao Xue
 * @date Jul 21, 2017 11:42:35 AM
 */
public class NoteBook {
    
    public void run() {
        System.out.println("笔记本运行");
    }
    
    public void useUSB(USB usb) {
        if (usb != null) {
            usb.open();
            usb.close();
        }
    }
    
    public void shutDown() {
        System.out.println("笔记本关闭");
    }
}
