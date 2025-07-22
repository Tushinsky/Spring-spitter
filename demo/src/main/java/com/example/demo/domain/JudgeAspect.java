package com.example.demo.domain;

import org.aspectj.lang.Aspects;
import org.aspectj.lang.annotation.Pointcut;

public class JudgeAspect extends Aspects {
    public JudgeAspect() {
    }
    @Pointcut(value = "execution(* com.example.demo.springidol.Performer.perform(..))")
    public void performance(){

    }
}
