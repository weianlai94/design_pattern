package com.weianlai.design.pattern.structural.adapter.classadapter;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Test {

    public static void main(String[] args) {
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }

}
