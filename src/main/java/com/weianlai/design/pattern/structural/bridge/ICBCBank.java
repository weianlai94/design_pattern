package com.weianlai.design.pattern.structural.bridge;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
