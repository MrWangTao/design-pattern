package com.xt.patterns.strategy.service.impl;

import com.xt.patterns.strategy.service.CreamProvider;

/**
 * Create User: wangtao
 * Create In 2019-05-28 11:49
 * Description:
 **/
public class NoCreamProvider implements CreamProvider {

    @Override
    public void cream() {
        System.out.println("add no cream");
    }
}
