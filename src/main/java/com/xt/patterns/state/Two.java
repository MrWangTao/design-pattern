package com.xt.patterns.state;

/**
 * Create User: wangtao
 * Create In 2019-06-03 17:53
 * Description:
 **/
public class Two implements State {

    @Override
    public void change() {
        System.out.println("****** two change ******");
    }
}
