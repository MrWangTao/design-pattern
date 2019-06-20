package com.xt.patterns.strategy.service.impl;

import com.xt.patterns.strategy.service.SugerProvider;

/**
 * Create User: wangtao
 * Create In 2019-05-28 11:48
 * Description:
 **/
public class NormalSugerProvider implements SugerProvider {

    @Override
    public void suger() {
        System.out.println("add normal suger");
    }
}
