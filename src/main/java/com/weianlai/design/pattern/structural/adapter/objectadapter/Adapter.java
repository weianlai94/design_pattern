package com.weianlai.design.pattern.structural.adapter.objectadapter;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapterRequest();
    }
}
