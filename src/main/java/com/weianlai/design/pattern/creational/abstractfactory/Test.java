package com.weianlai.design.pattern.creational.abstractfactory;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.getArticle().produce();
        courseFactory.getVideo().produce();
    }

}
