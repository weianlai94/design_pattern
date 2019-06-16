package com.weianlai.design.pattern.principle.openclose;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Test {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscount(96, "java基础", 300d);
        JavaDiscount javaDiscount = (JavaDiscount) iCourse;
        System.out.println("课程id：" + iCourse.getId() + "课程名称：" + iCourse.getName() + "课程折后价价格：" + iCourse.getPrice() + "课程原价" + javaDiscount.getOriginPrice());
    }

}
