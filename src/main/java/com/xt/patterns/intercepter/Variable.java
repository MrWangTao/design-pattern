package com.xt.patterns.intercepter;

/**
 * Create User: wangtao
 * Create In 2019-06-20 10:34
 * Description: 终结表达式
 **/
public class Variable implements Expression {

    @Override
    public int interpret(Context context) {
        return context.LookupValue(this);
    }

}
