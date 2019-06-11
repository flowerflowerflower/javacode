package com.example.learnjava.proxy;

public class PersonImpl implements Person {
    @Override
    public void sing() {
        System.out.println("开始唱歌");
    }

    @Override
    public void dance() {
        System.out.println("开始跳舞");
    }
}
