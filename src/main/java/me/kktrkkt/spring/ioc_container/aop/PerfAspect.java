package me.kktrkkt.spring.ioc_container.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

//    @Around("execution(* me.kktrkkt.spring.ioc_container.aop.EventService.*(..))")
//    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
//        long time = System.currentTimeMillis();
//        Object result = joinPoint.proceed();
//        System.out.println(System.currentTimeMillis() - time);
//        return result;
//    }

//    @Around("bean(eventService)")
//    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
//        long time = System.currentTimeMillis();
//        Object result = joinPoint.proceed();
//        System.out.println(System.currentTimeMillis() - time);
//        return result;
//    }

    @Around("@annotation(PerfLogging)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        long time = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        System.out.println(System.currentTimeMillis() - time);
        return result;
    }

    @Before("bean(eventService)")
    public void before() {
        System.out.println("before");
    }

    @AfterReturning("bean(eventService)")
    public void afterReturning() {
        System.out.println("done");
    }

    @AfterThrowing("bean(eventService)")
    public void afterThrowing() {
        System.out.println("occurred error");
    }
}
