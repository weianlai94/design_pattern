package com.weianlai.design.pattern.structural.bridge;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccount() {
        System.out.println("这是一个定期账号");
    }
}
