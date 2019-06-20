package com.xt.patterns.template;

/**
 * Create User: wangtao
 * Create In 2019-05-31 15:13
 * Description:
 **/
public abstract class MakeMoonCake {

    public void make() {
        roast();
        doShape();
        onSale();
    }

    protected void roast() {
        System.out.println("make method is default");
    }

    public abstract void doShape();

    private double onSale() {
        System.out.println("****** onsale 0.8 ******");
        return 0.8;
    }

}
