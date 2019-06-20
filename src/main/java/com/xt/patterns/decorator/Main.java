package com.xt.patterns.decorator;

import com.xt.patterns.decorator.additional.Chocolate;
import com.xt.patterns.decorator.additional.Cream;
import com.xt.patterns.decorator.superclass.StarBucks;
import com.xt.patterns.decorator.type.Coffee;

/**
 * Create User: wangtao
 * Create In 2019-05-30 09:44
 * Description:
 **/
public class Main {

    public static void main(String[] args) {
        StarBucks coffee = new Coffee();
        coffee = new Cream(coffee);
        coffee = new Chocolate(coffee);
        System.out.println(String.format("current coffee id: %s, ¥: %s", coffee.getDesc(), coffee.price()));
        coffee = new Chocolate(coffee);
        System.out.println(String.format("current coffee id: %s, ¥: %s", coffee.getDesc(), coffee.price()));
    }

}
