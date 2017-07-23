package org.xueyao05.notebook;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 11:50:19 AM
 */
public class Test {
    public static void main(String[] args) {
        //创建笔记本实体对象
        NoteBook nb = new NoteBook();
        //笔记本开启
        nb.run();
        
        //创建鼠标实体对象
        Mouse m = new Mouse();
        //笔记本使用鼠标
        nb.useUSB(m);
        
        //创建键盘对象
        Keyboard kb = new Keyboard();
        //笔记本使用键盘
        nb.useUSB(kb);
        
        //笔记本关闭
        nb.shutDown();
    }
}
