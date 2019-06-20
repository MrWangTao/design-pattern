package com.xt.patterns.decorator.type;

import com.xt.patterns.decorator.superclass.StarBucks;

/**
 * Create User: wangtao
 * Create In 2019-05-30 09:31
 * Description:
 **/
public class Coffee extends StarBucks {

    public Coffee() {
        desc = "I am coffee class";
    }

    @Override
    public double price() {
        return 20;
    }
}
