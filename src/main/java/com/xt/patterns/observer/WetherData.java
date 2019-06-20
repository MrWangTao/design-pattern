package com.xt.patterns.observer;

/**
 * Create User: wangtao
 * Create In 2019-05-29 10:34
 * Description:
 **/
public class WetherData {

    private float tempersure;
    private float pressure;

    public WetherData(float tempersure, float pressure) {
        this.tempersure = tempersure;
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return tempersure + "摄氏度， " + pressure +  "压强";
    }
}
