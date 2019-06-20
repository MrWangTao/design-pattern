package com.xt.patterns.singleton;

import java.util.Objects;

/**
 * Create User: wangtao
 * Create In 2019-05-30 16:54
 * Description:
 **/
public class SingletonOne {

    /**
     * 静态表示类属性
     * <p>这种方式是无论使用不使用，在类加载的时候都会创建这个对象</p>
     */
    private static SingletonOne one = new SingletonOne();

    /**
     * 必须私有化构造函数
     *
     * <p>1: 如果不定义构造函数，默认会有一个public 无参构造 </p>
     * <p>2: 私有化构造函数，防止使用者自己new 对象 </p>
     */
    private SingletonOne() {}

    public SingletonOne getInstance() {
        if (Objects.isNull(one)) {
            one = new SingletonOne();
        }
        return one;
    }

}
