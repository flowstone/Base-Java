package org.xueyao.work07;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 8:30:45 AM
 */
public class Test {
    public static void main(String[] args) {
        goToActingCute(new ActingCuteCat("白色",2));
        goToActingCute(new ActingCuteDog("黑色",3));
        
        goToEat(new Cat("花色",4));
        goToEat(new Dog("土豪金",5));
    }
    
    public static void goToActingCute(Actor a) {
        if (a instanceof ActingCuteCat) {
            ((ActingCuteCat)a).catchMouse();
        } else if (a instanceof ActingCuteDog) {
            ((ActingCuteDog)a).lookHome();
        }
    }
    
    public static void goToEat(Animal a) {
        if (a instanceof Cat) {
            ((Cat)a).catchMouse();
        } else if (a instanceof Dog) {
            ((Dog)a).lookHome();
        }
    }
}
