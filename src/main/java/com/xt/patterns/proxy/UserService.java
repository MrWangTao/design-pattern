package com.xt.patterns.proxy;

/**
 * Create User: wangtao
 * Create In 2019-06-04 14:58
 * Description:
 **/
public class UserService implements IUserService {

    @Override
    public void save() {
        System.out.println("======> save user" );
    }

    @Override
    public void update() {
        System.out.println("======> update user");
    }
}
