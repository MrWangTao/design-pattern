package com.xt.patterns.flyweight;

import com.xt.patterns.flyweight.service.Plant;

import java.util.HashMap;
import java.util.Map;

/**
 * Create User: wangtao
 * Create In 2019-06-20 10:06
 * Description:
 **/
public class PlantFactory {

    private static Map<Integer, Plant> plantMap = new HashMap<>();

    public static Plant newInstance(int type) {

        if (!plantMap.containsKey(type)) {
            switch (type) {
                case 0:
                    plantMap.put(0, new Tree());
                    break;
                case 1:
                    plantMap.put(1, new Grass());
                    break;
            }
        }
        return plantMap.get(type);
    }

}
