package com.weianlai.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Pig implements Cloneable {

    private String name;
    private Date brithday;

    public Pig(String name, Date brithday) {
        this.name = name;
        this.brithday = brithday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 对引用类型也要进行拷贝，从而实现深拷贝，避免浅拷贝带来的bug
        Pig pig = (Pig) super.clone();
        pig.brithday = (Date) pig.brithday.clone();
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", brithday=" + brithday +
                '}' + super.toString();
    }

}
