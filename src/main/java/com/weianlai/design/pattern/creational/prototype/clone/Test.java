package com.weianlai.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date brithday = new Date();
        Pig pig = new Pig("佩奇", brithday);
        Pig pig1 = (Pig) pig.clone();
        System.out.println(pig);
        System.out.println(pig1);

        pig.getBrithday().setTime(111111111111L);
        pig.setName("二哈");
        System.out.println(pig);
        System.out.println(pig1);

    }

}
