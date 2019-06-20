package com.xt.patterns.responsibility_chain;

/**
 * Create User: wangtao
 * Create In 2019-06-18 10:26
 * Description:
 **/
public abstract class Handler {

    protected Handler handler;

    public abstract void handlerRequest();

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
