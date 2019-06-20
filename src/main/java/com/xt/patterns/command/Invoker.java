package com.xt.patterns.command;

/**
 * Create User: wangtao
 * Create In 2019-05-31 10:08
 * Description:
 **/
public class Invoker {

    Command command;

    public Invoker() {
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }

    public void undo() {
        command.undo();
    }

    public static void main(String[] args) {
        Action action = new Action();
        ConcreteComand concreteComand = new ConcreteComand(action);
        Invoker invoker = new Invoker();
        invoker.setCommand(concreteComand);
        invoker.execute();
        invoker.undo();
    }

}
