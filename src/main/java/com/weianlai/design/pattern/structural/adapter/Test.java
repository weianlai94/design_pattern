package com.weianlai.design.pattern.structural.adapter;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }

}
