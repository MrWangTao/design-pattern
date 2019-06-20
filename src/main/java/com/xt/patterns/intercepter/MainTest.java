package com.xt.patterns.intercepter;

/**
 * Create User: wangtao
 * Create In 2019-06-20 10:36
 * Description:
 **/
public class MainTest {

    public static void main(String[] args) {
        //(a*b)/(a-b+15000)
        Context context = new Context();
        Variable a = new Variable();
        Variable b = new Variable();
        Constant c = new Constant(15000);

        context.addValue(a, 14);
        context.addValue(b, 10000);

        Expression expression = new Div(new Mul(a, b), new Add(new Sub(a, b), c));
        System.out.println("Result = "+expression.interpret(context));
    }

}
