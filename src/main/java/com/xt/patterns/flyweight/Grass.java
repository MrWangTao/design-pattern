package com.xt.patterns.flyweight;

import com.xt.patterns.flyweight.service.Plant;

/**
 * Create User: wangtao
 * Create In 2019-06-20 10:01
 * Description:
 **/
public class Grass extends Plant {

    @Override
    public void display(int x, int y, int z) {
        System.out.println(String.format("Grass [x: %d, y: %d, z: %d]", x, y, z));
    }

}
