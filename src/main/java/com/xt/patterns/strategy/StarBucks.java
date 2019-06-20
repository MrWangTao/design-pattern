package com.xt.patterns.strategy;

import com.xt.patterns.strategy.service.CreamProvider;
import com.xt.patterns.strategy.service.SugerProvider;

/**
 * Create User: wangtao
 * Create In 2019-05-28 11:38
 * Description:
 **/
public abstract class StarBucks {

    /**
     * 策略模式
     * 将抽象出来的行为接口在超类中引用，在子类中复制
     */
    CreamProvider creamProvider;

    SugerProvider sugerProvider;

    public void make() {
        System.out.println("make coffee");
    }

    public abstract void size();

    public void cream() {
        creamProvider.cream();
    }

    public void sugar() {
        sugerProvider.suger();
    }

    public void setCreamProvider(CreamProvider creamProvider) {
        this.creamProvider = creamProvider;
    }

    public void setSugerProvider(SugerProvider sugerProvider) {
        this.sugerProvider = sugerProvider;
    }
}
