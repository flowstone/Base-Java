package org.xueyao.work10;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 9:58:06 PM
 */
public class Buyer extends AdminStaff{

    public Buyer() {
        super();
    }

    public Buyer(String numberId, String name) {
        super(numberId, name);
    }

    @Override
    public void work() {
        System.out.println("工号为 "+getNumberId()+" 的采购专员 "+getName()+" 在采购音响设备");
    }

}
