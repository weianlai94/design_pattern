package com.weianlai.design.pattern.creational.singleton;

/**
 * 懒汉式
 * @author: weianlai
 * @motto: In doing we learn
 */
public class LazySingleton {

    private volatile static LazySingleton lazySingletonInstance = null;

    public static LazySingleton getInstance() {
        if (lazySingletonInstance == null) {
            synchronized(LazySingleton.class) {
                if (lazySingletonInstance == null) {
                    lazySingletonInstance = new LazySingleton();
                }
            }
        }
        return lazySingletonInstance;
    }

}
