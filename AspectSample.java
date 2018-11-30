package com.sample.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectSample {

    @Before("execution(* com.sample.aop.*.*(.. ))")
    public void logBefore(final JoinPoint joinPoint){
        System.out.println("--------------------");
        System.out.println("The method signature is "+joinPoint.getSignature().getName());
        System.out.println("--------------------");
    }

    @After("execution(* com.sample.aop.*.*(.. ))")
    public void logAfter(final JoinPoint joinPoint){
        System.out.println("--------------------");
        System.out.println("The Log Executes after Method call");
        System.out.println("--------------------");
    }

}
