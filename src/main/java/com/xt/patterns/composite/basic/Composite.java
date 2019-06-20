package com.xt.patterns.composite.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * Create User: wangtao
 * Create In 2019-06-03 16:10
 * Description:
 **/
public class Composite extends Component {

    public List<Component> list = new ArrayList<>();

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void kill() {
        System.out.println("****** " + name + " ******");
        list.stream().forEach(component -> component.kill());
    }


    public static void main(String[] args) {
        Composite composite = new Composite("总");
        Composite child1Composite = new Composite("child_1");
        Composite child2Composite = new Composite("child_2");
        Leaf jianpan = new Leaf("键盘");
        Leaf shubiao = new Leaf("鼠标");
        Leaf diannao = new Leaf("电脑");
        Leaf erji = new Leaf("耳机");
        child1Composite.add(jianpan);
        child1Composite.add(shubiao);
        child2Composite.add(diannao);
        child2Composite.add(erji);
        composite.add(child1Composite);
        composite.add(child2Composite);
        composite.kill();
    }

}
