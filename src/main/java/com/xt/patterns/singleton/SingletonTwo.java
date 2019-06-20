package com.xt.patterns.singleton;

import java.util.Objects;

/**
 * Create User: wangtao
 * Create In 2019-05-30 17:02
 * Description:
 **/
public class SingletonTwo {

    private static volatile SingletonTwo two = null;

    private SingletonTwo() {}

    /**
     * volatile(只保证单一操作：一次读或者一次写 的原子性) 和 synchronized 保证了原子性、内存可见性、防止指令重排序
     *
     * @return
     */
    public static SingletonTwo getInstance() {
        if (Objects.isNull(two)) {
            synchronized (SingletonTwo.class) {
                if (Objects.isNull(two)) {
                    two = new SingletonTwo();
                }
            }
        }
        return two;
    }

}
