package com.coding.pattern.singleton;

public class Singleton {

    // このクラスに唯一のインスタンス
    private static Singleton instance = new Singleton();

    private Singleton() {}

    // インスタンス取得メソッド
    public static Singleton getInstance() {
        return instance;
    }
}
