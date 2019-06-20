package com.xt.patterns.strategy;

import com.xt.patterns.strategy.service.impl.NoCreamProvider;
import com.xt.patterns.strategy.service.impl.NormalCreamProvider;
import com.xt.patterns.strategy.service.impl.NormalSugerProvider;

/**
 * Create User: wangtao
 * Create In 2019-05-28 11:51
 * Description:
 **/
public class NoCreamNormalSugerStarBucks extends StarBucks {

    public NoCreamNormalSugerStarBucks() {
        creamProvider = new NoCreamProvider();
        sugerProvider = new NormalSugerProvider();
    }

    @Override
    public void size() {
        System.out.println("big");
    }

    public static void main(String[] args) {
        StarBucks starBucks = new NoCreamNormalSugerStarBucks();
        starBucks.setCreamProvider(new NormalCreamProvider());
        starBucks.make();
        starBucks.cream();
        starBucks.sugar();
        starBucks.size();
    }

}
