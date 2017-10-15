package me.xueyao.aspect;

/**
 * 切面类 Aspect
 * @author XueYao
 *
 */
public class MyAspect {

    /**
     * 通知(增强)
     */
    public void writeLog() {
        System.out.println("日志记录...");
    }

}
