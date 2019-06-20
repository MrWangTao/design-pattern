package com.xt.patterns.decorator.superclass;

/**
 * Create User: wangtao
 * Create In 2019-05-30 09:29
 * Description:
 **/
public abstract class StarBucks {

    public String desc = "this is superclass";

    public String getDesc() {
        return desc;
    }

    public abstract double price();

}
