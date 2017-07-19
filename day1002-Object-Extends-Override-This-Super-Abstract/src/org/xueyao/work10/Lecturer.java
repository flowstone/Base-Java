package org.xueyao.work10;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 9:54:37 PM
 */
public class Lecturer extends Teacher{
    
    public Lecturer() {
        super();
    }

    public Lecturer(String numberId, String name) {
        super(numberId, name);
    }

    @Override
    public void work() {
        System.out.println("工号为 "+getNumberId()+" 的讲师 "+getName()+" 在讲课");
    }

}
