package com.weianlai.design.pattern.structural.decorator;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String doSomething() {
        return "加香菜";
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个煎饼";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }

}
