package com.xt.patterns.command;

/**
 * Create User: wangtao
 * Create In 2019-05-31 10:03
 * Description: 命令接口
 **/
public interface Command {

    void execute();

    void undo();

}
