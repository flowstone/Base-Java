package org.xueyao06.employee;
/**
 * @author Yao Xue
 * @date Jul 20, 2017 3:06:34 PM
 */
public abstract class Employee {
    private String id;
    private String name;
    
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
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
