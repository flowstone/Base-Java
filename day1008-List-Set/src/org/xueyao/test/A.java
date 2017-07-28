package org.xueyao.test;

import java.util.ArrayList;

/**
 * @author Yao Xue
 * @date Jul 28, 2017 1:49:33 PM
 */
public class A {
    public static void main(String[] args) {
        ArrayList<? super z> arrayList = new ArrayList<>();
        //父类引用指向子类对象 :向上转型
        arrayList.add(new z());
        arrayList.add(new zizi());
        
        //没有意义
        ArrayList<? extends z> arrayList2 = new ArrayList<>();
    }
}

class f {
    
}
class z extends f {
    
}

class zizi extends z {
    
}