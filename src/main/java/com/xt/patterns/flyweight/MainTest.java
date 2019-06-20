package com.xt.patterns.flyweight;

/**
 * Create User: wangtao
 * Create In 2019-06-20 10:10
 * Description:
 **/
public class MainTest {

    public static void main(String[] args) {
        // 已分配内存中的剩余空间 ：
        // long free = Runtime.getRuntime().freeMemory();
        // 分配内存：
        // long total = Runtime.getRuntime().totalMemory();
        // 最大内存：
        // long max = Runtime.getRuntime().maxMemory();
        // 已占用的内存：

        PlantManager mPlantManager;
        mPlantManager = new PlantManager();
        mPlantManager.displayTrees();
    }

}
