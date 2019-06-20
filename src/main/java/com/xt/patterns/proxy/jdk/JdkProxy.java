package com.xt.patterns.proxy.jdk;

import com.xt.patterns.proxy.IUserService;
import com.xt.patterns.proxy.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Create User: wangtao
 * Create In 2019-06-04 15:04
 * Description:
 **/
public class JdkProxy {

    private IUserService iUserService;

    public JdkProxy(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    public Object newProxyInstance() {
        return Proxy.newProxyInstance(iUserService.getClass().getClassLoader(),
                iUserService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //执行目标对象方法
                        System.out.println("proxy class type is : " + proxy.getClass().getSimpleName());
                        System.out.println("method name is : " + method.getName());
                        // returnValue 是具体执行方法的
                        Object returnValue = method.invoke(iUserService, args);
                        return returnValue;
                    }
                });
    }

    public static void main(String[] args) {
        IUserService iUserService = new UserService();
        IUserService proxy = (IUserService) new JdkProxy(iUserService).newProxyInstance();
        proxy.save();
        System.out.println("execute IUserService save method");

    }

}
