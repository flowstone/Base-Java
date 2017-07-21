package org.xueyao05.notebook;
/**
 * @description 鼠标类，要符合USB接口
 * @author Yao Xue
 * @date Jul 21, 2017 11:40:11 AM
 */
public class Mouse  implements USB{

    @Override
    public void open() {
        System.out.println("鼠标开启");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }

}
