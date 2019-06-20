package com.xt.patterns.responsibility_chain;

/**
 * Create User: wangtao
 * Create In 2019-06-18 10:29
 * Description:
 **/
public class MainTest {


    public static void main(String[] args) {
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();
        concreteHandler1.setHandler(concreteHandler2);
        concreteHandler1.handlerRequest();
    }

}
