package com.sample.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect
public class AspectSample {

    @Pointcut("execution(* com.sample.aop.*.*(.. ))")
    public void testPointsCutSamples(){

    }

/*
    @Before("testPointsCutSamples()")
    public void logBefore(final JoinPoint joinPoint) {
        System.out.println("Log Before The method signature is " + joinPoint.getSignature().getName());
        final Object[] args = joinPoint.getArgs();
        //final List<Integer> list = new ArrayList<>();
        //IntStream.range(0, args.length).forEach(System.out::print);
        Arrays.asList(args).stream().forEach(System.out::println);
    }

    @After("testPointsCutSamples()")
    public void logAfter(final JoinPoint joinPoint) {
        System.out.println("Log After Executes after Method call");
    }
*/

    @AfterReturning(value = "testPointsCutSamples()", returning = "result")
    public void logAfterReturnResult(final JoinPoint joinPoint, final Object result) {
        System.out.println("The Method Returned result " + result);
    }

    @AfterThrowing(value = "testPointsCutSamples()", throwing = "error")
    public void logAfterThrowing(final JoinPoint joinPoint, final Throwable error) {
        System.out.println("The Error statement executed" + error);
    }

    @Around("testPointsCutSamples()")
    public void logAround(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("Before Inside Around Method");
        proceedingJoinPoint.proceed();
        System.out.println("Inside Around Method");
    }

}
