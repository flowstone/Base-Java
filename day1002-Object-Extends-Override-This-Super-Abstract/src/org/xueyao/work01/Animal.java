package org.xueyao.work01;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 7:44:10 PM
 */
public class Animal {
   private String name;
   private String color;
   
   public Animal() {
       
   }
   
   public Animal(String name, String color) {
       this.name = name;
       this.color = color;
   }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
       
   
}
