package com.weianlai.design.pattern.structural.bridge;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccount() {
        System.out.println("这是一个活期账号");
    }
}
