package com.xt.patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Create User: wangtao
 * Create In 2019-05-29 10:36
 * Description:
 **/
public class FirstObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        display(arg);
    }

    public void display(Object arg) {
        WetherData data = (WetherData) arg;
        System.out.println(data);
    }

    public static void main(String[] args) {
        FirstObserver firstObserver = new FirstObserver();
        Subject subject = new Subject();
        subject.addObserver(firstObserver);
        subject.setSubject(new WetherData(30, 150));
    }

}
