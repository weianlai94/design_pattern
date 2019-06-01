package com.weianlai.design.pattern.creational.singleton;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class T implements Runnable {
    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
