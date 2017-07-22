package org.xueyao.work06;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 9:55:00 PM
 */
public abstract class Feed {
    private String breed;
    private String name;
    
    public Feed() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Feed(String breed, String name) {
        super();
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();
}
