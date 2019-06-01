package com.weianlai.design.pattern.structural.decorator;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Test {

    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new SausageDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
//        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + "销售价格：" + aBattercake.cost() + ((EggDecorator) aBattercake).doSomething());
    }

}
