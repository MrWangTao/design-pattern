package com.xt.patterns.state;

/**
 * Create User: wangtao
 * Create In 2019-06-03 17:53
 * Description:
 **/
public class Three implements State {

    @Override
    public void change() {
        System.out.println("****** three change ******");
    }
}
