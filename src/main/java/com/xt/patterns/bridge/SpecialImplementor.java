package com.xt.patterns.bridge;

/**
 * Create User: wangtao
 * Create In 2019-06-05 18:40
 * Description:
 **/
public class SpecialImplementor implements Implementor {

    @Override
    public void sendMessage() {
        System.out.println("****** 特殊 ******");
    }
}
