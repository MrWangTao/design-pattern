package com.xt.patterns.bridge;

/**
 * Create User: wangtao
 * Create In 2019-06-05 18:35
 * Description:
 **/
public class BaseMessage extends AbstractMessage {

    public BaseMessage(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
    }

    public void addition() {
        System.out.println("****** 额外方法 ******");
    }

    public static void main(String[] args) {
        Implementor implementor = new BaseImplementor();
        AbstractMessage message = new BaseMessage(implementor);
        message.sendMessage();
        implementor = new SpecialImplementor();
        message = new BaseMessage(implementor);
        message.sendMessage();
    }

}
