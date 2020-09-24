package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggerAspect {

//  @Pointcut("execution(* com.spring.aop.*.*(..))")
//  private void forDaoPackage() {}

//  @Before("forDaoPackage()")
//  public void beforeAddAccountAdvice() {
//    System.out.println("\n=====>>> Executing @Before advice on method");
//  }
//
//  @Before("forDaoPackage()")
//  public void performApiAnalytics() {
//    System.out.println("\n=====>>> Performing API analytics");
//  }

  @AfterReturning(pointcut = "execution(* com.spring.aop.*.*(..))", returning = "result")
  public void beforeAddPackage(JoinPoint joinPoint, boolean result) {

    System.out.println("Scan all package ===================");

    MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
    System.out.println("Method: " + methodSignature);

    // display method arguments

    Object[] args = joinPoint.getArgs();
    // get args

    for (Object o : args) {
      System.out.println(o);
    }

    // Get result method
    System.out.println("result method: " + result);

  }

  @AfterThrowing(pointcut = "execution(* com.spring.aop.AccountDAO.findAccount(..))", throwing = "theExc")
  public void afterThrowing(JoinPoint joinPoint, Throwable theExc) {
    System.out.println("Exception: " + theExc);
  }

  @After("execution(* com.spring.aop.*.*(..))")
  public void after() {
    System.out.println("========>>> After executing");
  }

  @Around("execution(* com.spring.aop.*.getFortune(..))")
  public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

    // Print Method

    String metthod = proceedingJoinPoint.getSignature().toShortString();
    System.out.println("======>>> method " + metthod);

    // Begin timestamp

    Long begin = System.currentTimeMillis();
    Object result = null;
    try {

      // execute method
      result = proceedingJoinPoint.proceed();

      // End time

      Long end = System.currentTimeMillis();

      // Duration
      Long duration = end - begin;
      System.out.println("======>>> duration: " + duration / 1000 + " second");
    } catch (Exception e) {
      System.out.println("==> ex " + e);
      throw e;
    }

    return result;

  }

}
