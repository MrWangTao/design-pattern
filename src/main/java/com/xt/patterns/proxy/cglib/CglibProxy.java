package com.xt.patterns.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Create User: wangtao
 * Create In 2019-06-04 16:37
 * Description:
 **/
public class CglibProxy implements MethodInterceptor {

    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    public Object cglibProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        // CallBack 需要实现MethodInterceptor接口
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("method callback start");
        // invoke方法有两个参数 Object obj, Object··· args
        // 这里的Object 是我们要执行的目标类，而不是intercept这个方法中的第一个参数，如果使用错，则会出现循环调用
        Object invoke = method.invoke(target, objects);
        System.out.println("method callback start");
        return invoke;
    }

    public static void main(String[] args) {
        UserDao o = (UserDao) new CglibProxy(new UserDao()).cglibProxyInstance();
        o.bear();
    }

}
