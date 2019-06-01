package com.weianlai.design.pattern.structural.decorator;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Battercake extends ABattercake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }

}
