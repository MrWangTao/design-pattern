package com.xt.patterns.decorator.additional;

import com.xt.patterns.decorator.superclass.StarBucks;

/**
 * Create User: wangtao
 * Create In 2019-05-30 09:35
 * Description:
 **/
public class Cream extends AdditionalInterface {

    private StarBucks starBucks;

    public Cream(StarBucks starBucks) {
        this.starBucks = starBucks;
    }

    @Override
    public String getDesc() {
        return starBucks.getDesc() + ", add cream";
    }

    @Override
    public double price() {
        return starBucks.price() + 5;
    }
}
