package com.example.demo.springidol;

import com.example.demo.springidol.CriticismEngine;

public class CriticismEngineImpl implements CriticismEngine {
    public CriticismEngineImpl() {
    }

    private String[] criticismPool;
    @Override
    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }

    @Override
    public String getCriticism() {
        int i = (int) (Math.random() * criticismPool.length);
        return criticismPool[i];
    }
}
