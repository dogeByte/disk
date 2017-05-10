package com.jing._02;

/**
 * 静态内部类实现单例
 * 
 * @version 1.0.0
 * @author  JingBo
 */

public class Inner {

    private Inner() {
    }

    private static class InstanceHolder {

        private static final Inner INSTANCE = new Inner();
    }

    public static Inner getInstance() {
        return InstanceHolder.INSTANCE;
    }

}
