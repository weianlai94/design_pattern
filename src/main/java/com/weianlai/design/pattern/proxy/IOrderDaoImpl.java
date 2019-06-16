package com.weianlai.design.pattern.proxy;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class IOrderDaoImpl implements IOrderDao  {

    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }

}
