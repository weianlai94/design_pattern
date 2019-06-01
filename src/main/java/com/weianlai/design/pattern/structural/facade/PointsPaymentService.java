package com.weianlai.design.pattern.structural.facade;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift) {
        // 扣减积分
        System.out.println("支付" + pointsGift.getName() + "积分成功");
        return true;
    }

}
