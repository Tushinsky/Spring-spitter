package com.example.demo.domain;

import com.example.demo.springidol.CriticismEngine;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class JudgeAspect {
    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }

    private CriticismEngine criticismEngine;

    /**
     * Определение среза точек сопряжения
     */
    @Pointcut(value = "execution(* com.example.demo.springidol.Performer.perform(..))")
    public void performance(){

    }

    /**
     * ВЫзывается после успешного выполнения целевого метода
     */
    @AfterReturning("performance()")
    public void getCriticism() {
        System.out.println(criticismEngine.getCriticism());
    }

}
