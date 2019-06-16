package com.weianlai.design.pattern.principle.dependenceinversion;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Test {

    public static void main(String[] args) {
        Weianlai weianlai = new Weianlai();
        weianlai.studyCourse(new JavaCourse());
        weianlai.studyCourse(new FECourse());
    }

}
