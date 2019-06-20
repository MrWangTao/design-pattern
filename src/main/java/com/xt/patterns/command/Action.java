package com.xt.patterns.command;

/**
 * Create User: wangtao
 * Create In 2019-05-31 10:05
 * Description:
 **/
public class Action {

    public void execute() {
        System.out.println("****** execute method ******");
    }

    public void undo() {
        System.out.println("****** undo method ******");
    }

}
