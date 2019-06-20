package com.xt.patterns.template;

/**
 * Create User: wangtao
 * Create In 2019-05-31 15:17
 * Description:
 **/
public class MakeCircleMoonCake extends MakeMoonCake {

    @Override
    public void doShape() {
        System.out.println("****** the shape of the mooncake is circle  ******");
    }

    @Override
    protected void roast() {
        System.out.println("the method of roast is my definition");
    }

    public static void main(String[] args) {
        MakeCircleMoonCake makeCircleMoonCake = new MakeCircleMoonCake();
        makeCircleMoonCake.make();
    }

}
