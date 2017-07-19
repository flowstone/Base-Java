package org.xueyao.work10;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 9:49:58 PM
 */
public abstract class Employee {
    private String numberId;
    private String name;
    
    public Employee() {
        super();
    }

    public Employee(String numberId, String name) {
        this.numberId = numberId;
        this.name = name;
    }

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void work();
}
