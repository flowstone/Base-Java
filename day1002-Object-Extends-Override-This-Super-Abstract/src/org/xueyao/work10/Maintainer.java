package org.xueyao.work10;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 9:57:07 PM
 */
public class Maintainer extends AdminStaff{

    public Maintainer() {
        super();
    }

    public Maintainer(String numberId, String name) {
        super(numberId, name);
    }

    @Override
    public void work() {
        System.out.println("工号为 "+getNumberId()+" 的维护专员 "+getName()+" 在解决不能共享屏幕问题");
    }

}
