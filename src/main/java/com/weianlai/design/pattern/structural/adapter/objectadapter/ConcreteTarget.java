package com.weianlai.design.pattern.structural.adapter.objectadapter;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
