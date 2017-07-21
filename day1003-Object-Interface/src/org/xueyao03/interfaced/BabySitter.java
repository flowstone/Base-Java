package org.xueyao03.interfaced;
/**
 * @description 保姆接口
 * @author Yao Xue
 * @date Jul 21, 2017 9:31:04 AM
 */

public interface BabySitter {
    
    public static final int ID = 10;
    
    public abstract void feedTheBaby(); //喂宝宝吃东西
    public abstract void coaxTheBabyToSleep(); //哄宝宝睡觉
    
    public abstract void laugh(); //大笑
}
