package com.weianlai.design.pattern.structural.adapter.classadapter;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.adapterRequest();
    }

}
