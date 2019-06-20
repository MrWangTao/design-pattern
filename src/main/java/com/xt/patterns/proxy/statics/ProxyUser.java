package com.xt.patterns.proxy.statics;

import com.xt.patterns.proxy.IUserService;
import com.xt.patterns.proxy.UserService;

/**
 * Create User: wangtao
 * Create In 2019-06-04 14:55
 * Description: 静态代理模式就是在不修改别人代码的前提下进行方法的扩展等操作
 **/
public class ProxyUser implements IUserService {

    private IUserService iUserService;

    public ProxyUser(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @Override
    public void save() {
        System.out.println("****** proxy add start ******");
        iUserService.save();
        System.out.println("****** proxy add end ******");
    }

    @Override
    public void update() {
        System.out.println("****** proxy update start ******");
        iUserService.update();
        System.out.println("****** proxy update end ******");
    }

    public static void main(String[] args) {
        ProxyUser proxyUser = new ProxyUser(new UserService());
        proxyUser.save();
        proxyUser.update();
    }

}
