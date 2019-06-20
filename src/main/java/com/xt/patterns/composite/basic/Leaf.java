package com.xt.patterns.composite.basic;

/**
 * Create User: wangtao
 * Create In 2019-06-03 16:08
 * Description:
 **/
public class Leaf extends Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        System.out.println("****** " + name +  " add component ******");
    }

    @Override
    public void remove(Component component) {
        System.out.println("****** " + name +  "  remove component ******");
    }

    @Override
    public void kill() {
        System.out.println("****** " + name +  "  kill component ******");
    }
}
