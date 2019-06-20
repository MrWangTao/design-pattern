package com.xt.patterns.composite.basic;

/**
 * Create User: wangtao
 * Create In 2019-06-03 16:05
 * Description:
 **/
public abstract class Component {

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void kill();

}
