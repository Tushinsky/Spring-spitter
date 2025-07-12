package com.example.demo.domain;

/**
 * Класс, представляющий сцену для выступления артистов. Реализован с применением шаблона проектирования
 * "Одиночка" (Singleton). Гарантирует создание только одного экземпляра класса
 */
public class Stage {
    private Stage() {

    }

    private static class StageSingletonHolder {
        static Stage instance = new Stage();// создание единичного экземпляра
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance;// возвращает единичный экземпляр класса
    }
}
