package com.xt.patterns.visitor;

/**
 * Create User: wangtao
 * Create In 2019-06-20 13:58
 * Description:
 **/
public interface Element {

    //接受一个抽象访问者访问
    void accept(Visitor visitor);

}
