package com.xt.patterns.bridge;

/**
 * Create User: wangtao
 * Create In 2019-06-05 18:38
 * Description:
 **/
public class BaseImplementor implements Implementor {

    @Override
    public void sendMessage() {
        System.out.println("****** 基础 ******");
    }
}
