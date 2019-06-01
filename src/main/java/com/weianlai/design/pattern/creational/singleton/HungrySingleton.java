package com.weianlai.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class HungrySingleton implements Serializable {

    private static final HungrySingleton instace = new HungrySingleton();

    private HungrySingleton() {
        if (instace != null) {
            throw new RuntimeException("禁止通过反射破坏单例");
        }
    }

    public static HungrySingleton getInstance() {
        return instace;
    }

    /**
     * 解决序列化破坏单例模式
     *
     * @return
     */
    private Object readResolve() {
        return instace;
    }

}
