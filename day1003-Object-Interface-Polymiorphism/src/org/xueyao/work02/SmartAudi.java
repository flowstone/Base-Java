package org.xueyao.work02;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 9:13:15 PM
 */
public class SmartAudi extends Audi implements Smart{

    @Override
    public void automaticParking() {
        System.out.println("智能奥迪车在自动泊车");
    }

    @Override
    public void automaticDrive() {
        System.out.println("智能奥迪车在无人驾驶");
    }

}
