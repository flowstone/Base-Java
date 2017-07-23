package org.xueyao.work02;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 9:14:28 PM
 */
public class Test {
    public static void main(String[] args) {
        Audi a = new Audi();
        a.run();
        
        SmartAudi sa = new SmartAudi();
        sa.automaticParking();
        sa.automaticDrive();
        
        Audi aa = sa;
        aa.run();
        
        if (aa instanceof SmartAudi) {
            SmartAudi saa = (SmartAudi)aa;
            saa.automaticDrive();
            saa.automaticDrive();
        }
        
        Smart s = sa;
        s.automaticDrive();
        s.automaticParking();
       
    }
}
