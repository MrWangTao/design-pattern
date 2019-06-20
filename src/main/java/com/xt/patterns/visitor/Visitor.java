package com.xt.patterns.visitor;

/**
 * Create User: wangtao
 * Create In 2019-06-20 13:56
 * Description:
 **/
public interface Visitor {

    void visit(Student element);

    void visit(Teacher element);

}
