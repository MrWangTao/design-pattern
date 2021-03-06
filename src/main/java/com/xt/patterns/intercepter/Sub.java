package com.xt.patterns.intercepter;

/**
 * Create User: wangtao
 * Create In 2019-06-20 10:36
 * Description:
 **/
public class Sub implements Expression {

    private Expression left, right;

    public Sub(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
