package com.weianlai.design.pattern.structural.facade;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分校验成功，库存校验成功");
        return true;
    }

}
