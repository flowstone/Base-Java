package org.xueyao.annotation.task02;

import org.junit.Test;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 4:54:36 PM
 */
public class Test3 {
    @MyAnno3(type="小明",intArr={1,2,3,4})
    public void say() {
        System.out.println("今天天气不错");
        
    }
    @Test
    public void test() {
        say();
    }
}
