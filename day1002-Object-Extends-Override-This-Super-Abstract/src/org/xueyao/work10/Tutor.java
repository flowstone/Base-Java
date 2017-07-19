package org.xueyao.work10;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 9:55:58 PM
 */
public class Tutor extends Teacher{

    public Tutor() {
        super();
    }

    public Tutor(String numberId, String name) {
        super(numberId, name);
    }

    @Override
    public void work() {
        System.out.println("工号为 "+getNumberId()+"的助教 "+getName()+" 在帮助学生解决问题");
    }

}
