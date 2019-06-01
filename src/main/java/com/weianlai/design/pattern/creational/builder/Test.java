package com.weianlai.design.pattern.creational.builder;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("建造者模式").buildCourseArticle("设计模式笔记").build();
        System.out.println(course);
    }

}
