package org.xueyao.homework;
/**
 * .����Ա��Coder
        ���ԣ�
            ����name
            ����id
            ����salary
        ��Ϊ��
            ����work()
 * @author Yao Xue
 * @date Jul 3, 2017 4:54:59 PM
 */
public class Coder {
    private String name;
    private int id;
    private int salary;
    
    public Coder() {
    }

    public Coder(String name, int id, int salary) {
        super();
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("����Ϊ"+id+"��������Ϊ"+salary+"�ĳ���Ա����Ŭ����д�Ŵ���......");
    }
    
    
    
}
