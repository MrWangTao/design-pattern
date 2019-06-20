package com.xt.patterns.responsibility_chain;

/**
 * Create User: wangtao
 * Create In 2019-06-18 10:27
 * Description:
 **/
public class ConcreteHandler2 extends Handler {

    @Override
    public void handlerRequest() {
        if (getHandler() != null) {
            System.out.println("传递给下一个handler");
            getHandler().handlerRequest();
        } else {
            System.out.println("ConcreateHandler2 handler this request");
        }
    }

}
