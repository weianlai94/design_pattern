package com.weianlai.design.pattern.proxy.staticproxy;

import com.weianlai.design.pattern.proxy.Order;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);
        OrderServerStaticProxy orderServerStaticProxy = new OrderServerStaticProxy();
        orderServerStaticProxy.saveOrder(order);
    }

}
