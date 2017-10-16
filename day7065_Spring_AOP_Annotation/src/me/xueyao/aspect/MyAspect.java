package me.xueyao.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 切面类 Aspect
 * @author XueYao
 *
 */
@Component("myAspect")
@Aspect
public class MyAspect {

    /**
     * 通知(增强)
     */
    @Before("execution(* me.xueyao.dao.impl.UserDaoImpl.save(..))")
    public void writeLog(JoinPoint jp) {
        System.out.println("日志记录...");
    }

    /**
     * 后置通知，程序没有异常，就执行
     */
    @AfterReturning(value="execution(* me.xueyao.dao.impl.UserDaoImpl.delete(..))", returning="result")
    public void afterReturning(Object result) {
        System.out.println("后置通知..."+result);
    }
    
    /**
     * 环绕通知
     * pjp：指定的目标方法
     * @param pjp
     */
    @Around("execution(* me.xueyao.dao.impl.UserDaoImpl.update(..))")
    public void around(ProceedingJoinPoint pjp) {
        System.out.println("环绕之前通知");
        try {
            pjp.proceed();//执行目标
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("环绕之后通知...");
    }
    
    /**
     * 异常通知
     */
    @AfterThrowing(value="execution(* me.xueyao.dao.impl.UserDaoImpl.list(..))",throwing="ex")
    public void afterThrowing(Exception ex) {
        System.out.println("异常通知..."+ex.getMessage());
        
    }
    
    /**
     * 最终通知
     */
    @After("execution(* me.xueyao.dao.impl.UserDaoImpl.list())")
    public void after() {
        System.out.println("最终通知...");
    }
}
