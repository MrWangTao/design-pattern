package com.xt.patterns.intercepter;

/**
 * Create User: wangtao
 * Create In 2019-06-20 10:33
 * Description: 终结表达式
 **/
public class Constant implements Expression {

    private int i;

    public Constant(int i) {
        this.i = i;
    }

    @Override
    public int interpret(Context context) {
        return i;
    }

}
