package com.xt.patterns.bridge;

/**
 * Create User: wangtao
 * Create In 2019-06-05 18:32
 * Description:
 **/
public class AbstractMessage {

    private Implementor implementor;

    public AbstractMessage(Implementor implementor) {
        this.implementor = implementor;
    }

    public void sendMessage() {
        this.implementor.sendMessage();
    }
}
