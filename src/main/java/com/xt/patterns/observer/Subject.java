package com.xt.patterns.observer;

import java.util.Observable;

/**
 * Create User: wangtao
 * Create In 2019-05-29 10:26
 * Description:
 **/
public class Subject extends Observable {

    // WetherData wetherData;

    public void setSubject(WetherData wetherData) {
        // this.wetherData = wetherData;
        setChanged();
        notifyObservers(wetherData);
        clearChanged();
    }

}
