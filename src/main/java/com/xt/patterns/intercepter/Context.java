package com.xt.patterns.intercepter;

import java.util.HashMap;
import java.util.Map;

/**
 * Create User: wangtao
 * Create In 2019-06-20 10:34
 * Description: 环境（Context）角色
 **/
public class Context {

    private Map valueMap = new HashMap<>();

    public void addValue(Variable x, int y) {
        valueMap.put(x, y);
    }

    public int LookupValue(Variable x) {
        return (int) valueMap.get(x);
    }

}
