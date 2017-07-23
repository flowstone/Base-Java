package org.xueyao.work01;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 8:10:01 PM
 */
public class Car {
    private boolean status;
    
    public Car(){}
    public Car(boolean status) {
        this.status = status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus() {
        return status;
    }
    //成员内部类：发动机
    class Engine {
        public void work() {
            if (status) {
                System.out.println("发动机就飞速旋转");
            } else {
                System.out.println("发动机停止工作");
            }
        }
    }
}
