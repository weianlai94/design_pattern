package com.weianlai.design.pattern.structural.bridge;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();

}
