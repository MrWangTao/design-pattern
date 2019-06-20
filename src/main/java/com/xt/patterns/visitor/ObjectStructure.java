package com.xt.patterns.visitor;

import java.util.ArrayList;

/**
 * Create User: wangtao
 * Create In 2019-06-20 14:00
 * Description:
 **/
public class ObjectStructure {

    // 使用集合保存Element元素，示例没有考虑多线程的问题。
    private ArrayList<Element> elements = new ArrayList<>();

    /**
     * 访问者访问元素的入口
     *
     * @param visitor 访问者
     */
    public void accept(Visitor visitor) {
        for (int i = 0; i < elements.size(); i++) {
            Element element = elements.get(i);
            element.accept(visitor);
        }
    }

    /**
     * 把元素加入到集合
     *
     * @param element 待添加的元素
     */
    public void addElement(Element element) {
        elements.add(element);
    }

    /**
     * 把元素从集合中移除
     *
     * @param element 要移除的元素
     */
    public void removeElement(Element element) {
        elements.remove(element);
    }

    public static void main(String[] args) {
        // 初始化元素
        Element stu1 = new Student("Student Jim", 92, 3);
        Element stu2 = new Student("Student Ana", 89, 1);
        Element t1 = new Teacher("Teacher Mike", 83, 10);
        Element t2 = new Teacher("Teacher Lee", 88, 7);
        // 初始化对象结构
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(stu1);
        objectStructure.addElement(stu2);
        objectStructure.addElement(t1);
        objectStructure.addElement(t2);
        // 定义具体访问者，选拔成绩优秀者
        Visitor gradeSelection = new GradeSelection();
        // 具体的访问操作，打印输出访问结果
        objectStructure.accept(gradeSelection);
        System.out.println("----结构不变，操作易变----");
        // 数据结构是没有变化的，如果我们还想增加选拔科研优秀者的操作，那么如下。
        Visitor researcherSelection = new ResearcherSelection();
        objectStructure.accept(researcherSelection);
    }

}
