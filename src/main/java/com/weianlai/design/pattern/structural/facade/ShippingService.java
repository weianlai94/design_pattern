package com.weianlai.design.pattern.structural.facade;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class ShippingService {

    public String shipGift(PointsGift pointsGift) {
        // 物流系统对接系统
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }

}
