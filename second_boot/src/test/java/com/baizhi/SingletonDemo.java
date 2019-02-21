package com.baizhi;

/**
 * Create by 杨宁
 * On 2019/2/19.
 */
public class SingletonDemo {
    private static class SingletonClass{
        static final SingletonDemo instance = new SingletonDemo();
    }
    private SingletonDemo(){}
    public SingletonDemo getInstance(){
        return SingletonClass.instance;
    }
}
