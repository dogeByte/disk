package com.jing._02;

/**
 * 懒汉式单例
 * 
 * @version 1.0.0
 * @author  JingBo
 */

public class Idler {

    private Idler() {
    }

    private static volatile Idler instance = null;

    public static Idler getInstance() {
        if (instance == null) {
            synchronized (Idler.class) {
                if (instance == null) {
                    instance = new Idler();
                }
            }
        }
        return instance;
    }
}
