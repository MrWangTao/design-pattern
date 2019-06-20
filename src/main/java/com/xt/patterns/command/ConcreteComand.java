package com.xt.patterns.command;

/**
 * Create User: wangtao
 * Create In 2019-05-31 10:04
 * Description:
 **/
public class ConcreteComand implements Command {

    Action action;

    public ConcreteComand(Action action) {
        this.action = action;
    }

    @Override
    public void execute() {
        action.execute();
    }

    @Override
    public void undo() {
        action.undo();
    }
}
