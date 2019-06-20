package com.xt.patterns.strategy.service.impl;

import com.xt.patterns.strategy.service.SugerProvider;

/**
 * Create User: wangtao
 * Create In 2019-05-28 11:49
 * Description:
 **/
public class NoSugerProvider implements SugerProvider {

    @Override
    public void suger() {
        System.out.println("add no suger");
    }
}
