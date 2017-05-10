package com.jing._02;

/**
 * 饿汉式单例
 * 
 * @version 1.0.0
 * @author  JingBo
 */

public class Eager {

    private Eager() {
    }

    private static final Eager INSTANCE = new Eager();

    public static Eager getInstance() {
        return INSTANCE;
    }

}
