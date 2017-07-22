package org.xueyao.work03;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 9:08:00 PM
 */
public class Test {
    public static void main(String[] args) {
        Employee e = new Employee() {
            @Override
            public void work() {
                System.out.println("工号为"+getId()+"的员工"+getName()+"在努力的敲代码");
            }
        };
        e.setId("001");
        e.setName("范冰冰");
        e.work();
    }
}
