package com.weianlai.design.pattern.structural.facade;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Test {

    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T桖");
        GiftExchangeServce giftExchangeServce = new GiftExchangeServce();
        giftExchangeServce.giftExchange(pointsGift);
    }

}
