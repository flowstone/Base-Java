package me.xueyao.genericclass;
/**
 * @author Yao Xue
 * @date Jul 27, 2017 1:04:37 AM
 */
public interface GenericInterface<E> {
    void show(E e);

}

//实现类:实现类实现接口,不实现泛型
abstract class A<E> implements GenericInterface<E> {
    abstract void speak(E e);
}

//实现类:实现接口,同时指定类型
class C<String> implements GenericInterface<String> {

    @Override
    public void show(String e) {
        // TODO Auto-generated method stub
        
    }
    
}

class B<E> extends A<E> {
    
    @Override
    public void show(E e) {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    void speak(E e) {
        // TODO Auto-generated method stub
        
    }
}
