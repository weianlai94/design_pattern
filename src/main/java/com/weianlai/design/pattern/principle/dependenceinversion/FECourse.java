package com.weianlai.design.pattern.principle.dependenceinversion;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class FECourse implements ICourse{

    @Override
    public void studyCourse() {
        System.out.println("weianlai在学习前端课程");
    }

}
