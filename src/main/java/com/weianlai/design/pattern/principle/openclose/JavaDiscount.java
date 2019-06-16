package com.weianlai.design.pattern.principle.openclose;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class JavaDiscount extends JavaCourse {

    public JavaDiscount(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
