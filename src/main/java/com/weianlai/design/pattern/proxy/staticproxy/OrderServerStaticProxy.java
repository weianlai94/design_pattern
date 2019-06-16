package com.weianlai.design.pattern.proxy.staticproxy;

import com.weianlai.design.pattern.proxy.IOrderServer;
import com.weianlai.design.pattern.proxy.IOrderServerImpl;
import com.weianlai.design.pattern.proxy.Order;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class OrderServerStaticProxy {

    private IOrderServer iOrderServer;

    public int saveOrder(Order order) {
        beforeMethod();
        iOrderServer = new IOrderServerImpl();
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】 处理数据");
        // todo 设置DataSource
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
        afterMethod();
        return iOrderServer.saveOrder(order);
    }

    private void beforeMethod() {
        System.out.println("静态代理 before code");
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }

}
