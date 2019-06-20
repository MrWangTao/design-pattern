package com.xt.patterns.flyweight;

/**
 * Create User: wangtao
 * Create In 2019-06-20 09:31
 * Description: String对象是final类型，对象一旦创建就不可改变。
 * 在JAVA中字符串常量都是存在常量池中的，JAVA会确保一个字符串常量在常量池中只有一个拷贝。String a="abc"，其中"abc"就是一个字符串常量
 **/
public class TestString {

    public static void main(String[] args) {
        // 不用new的方式实质上是放在了字符串的常量池中
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }

}
