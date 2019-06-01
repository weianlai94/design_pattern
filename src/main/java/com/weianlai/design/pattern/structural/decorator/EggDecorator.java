package com.weianlai.design.pattern.structural.decorator;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String doSomething() {
        return "加香葱";
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
