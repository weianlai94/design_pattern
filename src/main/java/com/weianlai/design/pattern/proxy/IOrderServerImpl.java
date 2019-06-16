package com.weianlai.design.pattern.proxy;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class IOrderServerImpl implements IOrderServer {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        iOrderDao = new IOrderDaoImpl();
        System.out.println("Server层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
