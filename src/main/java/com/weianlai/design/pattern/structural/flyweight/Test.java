package com.weianlai.design.pattern.structural.flyweight;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Test {

    private static final String departments[] = {"RD", "BD", "PM", "QA"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }

}
