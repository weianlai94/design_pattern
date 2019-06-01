package com.weianlai.design.pattern.structural.facade;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class GiftExchangeServce {

    private ShippingService shippingService = new ShippingService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private QualifyService qualifyService = new QualifyService();

    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            // 资格校验通过
            if (pointsPaymentService.pay(pointsGift)) {
                // 如果支付成功
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("支付成功，订单号是：" + shippingOrderNo);
            }
        }
    }

}
