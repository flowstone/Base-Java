package me.xueyao.level2_03;
/**
 * @author Yao Xue
 * @date Jul 23, 2017 9:59:57 PM
 */
public class Person {
    private String name;
    private int lifeValue;
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Person(String name, int lifeValue) {
        super();
        this.name = name;
        this.lifeValue = lifeValue;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLifeValue() {
        
        return lifeValue;
    }
    public void setLifeValue(int lifeValue) {
        if (lifeValue < 0) {
            throw new NoLifeValueExption("生命值不能为负数"+lifeValue);
        }
        this.lifeValue = lifeValue;
    }
    
    
}
