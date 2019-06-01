package com.weianlai.design.pattern.creational.singleton;

/**
 * 静态内部类
 * @author: weianlai
 * @motto: In doing we learn
 */
public class StaticInternalSingleton {

    private StaticInternalSingleton() {}

    private static class InternalSingleton {
        private static final StaticInternalSingleton instance = new StaticInternalSingleton();
    }

    public static StaticInternalSingleton getInstance() {
        return InternalSingleton.instance;
    }

}
