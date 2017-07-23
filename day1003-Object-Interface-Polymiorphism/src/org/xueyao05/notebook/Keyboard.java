package org.xueyao05.notebook;
/**@description 键盘类，要符合USB接口
 * @author Yao Xue
 * @date Jul 21, 2017 11:41:07 AM
 */
public class Keyboard implements USB{

    @Override
    public void open() {
        System.out.println("键盘开启");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }
    
}
