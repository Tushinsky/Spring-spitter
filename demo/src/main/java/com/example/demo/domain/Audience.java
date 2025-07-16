package com.example.demo.domain;

import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

public class Audience {
    public void takeSeats() {
        System.out.println("The audience is taking their seats");// перед выступлением
    }

    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");// перед выступлением
    }

    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP");// после выступления
    }

    public void demandRefund() {
        System.out.println("Booo! We want our money back");// после неудачного выступления
    }

//    public void watchPerformance(MethodInvocationProceedingJoinPoint joinPoint) {
//
//        try {
//            takeSeats();
//            turnOffCellPhones();
//            long start = System.currentTimeMillis();// время начала
//
//            joinPoint.proceed();// вызов целевого метода
//
//            long end = System.currentTimeMillis();// время окончания
//            applaud();
//            System.out.println("The performance took " + (end - start) + " milliseconds.");
//        } catch (Throwable e) {
//            demandRefund();
//        }
//
//
//    }
}
