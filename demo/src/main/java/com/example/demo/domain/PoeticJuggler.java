package com.example.demo.domain;

import com.example.demo.springidol.Poem;

public class PoeticJuggler extends Juggler{
    private Poem poem;

    public PoeticJuggler(Poem poem) {
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() {
        super.perform();
        System.out.println("Wait reciting...");
        poem.recite();
    }
}
