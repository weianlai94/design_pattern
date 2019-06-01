package com.weianlai.design.pattern.creational.abstractfactory;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class JavaCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
