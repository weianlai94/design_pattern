package com.weianlai.design.pattern.creational.factorymethod;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class JavaVideoFactory extends VideoFactory {
    public Video getVideo() {
        return new JavaVideo();
    }
}
