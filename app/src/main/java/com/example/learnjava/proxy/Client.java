package com.example.learnjava.proxy;

public class Client {

    public static void main(String[] args) {
        PersonImplProxy proxy = new PersonImplProxy();
        Person person = proxy.createProxy();
        person.dance();
        person.sing();
    }

}
