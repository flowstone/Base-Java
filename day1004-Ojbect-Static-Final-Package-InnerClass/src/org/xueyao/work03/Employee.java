package org.xueyao.work03;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 8:55:56 PM
 */
public abstract class Employee {
    private String id;
    private String name;
    
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    public abstract void work();
}
