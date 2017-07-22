package org.xueyao.work06;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 12:22:58 AM
 */
public class Test {
    public static void main(String[] args) {
        BattlePlane bp = new BattlePlane();
        bp.fly();
        bp.fire();
        
        Plane p = new BattlePlane();
        BattlePlane bp2 = (BattlePlane) p;
        bp2.fire();
        bp2.fly();
        
        p.fly();
    }
}
