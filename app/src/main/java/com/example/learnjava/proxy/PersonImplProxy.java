package com.example.learnjava.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PersonImplProxy {
    private  Person person =new PersonImpl();

    public Person createProxy(){

        /**
         * 产生某个对象的代理对象
         * ClassLoader loader    当前代理对象的类加载器
         * Class<?>[] interfaces 代理对象的接口
         * InvocationHandler h   InvocationHandler对象
         */
        return (Person) Proxy.newProxyInstance(PersonImplProxy.class.getClassLoader(), person.getClass().getInterfaces(), new InvocationHandler() {

            /**
             * @param proxy 把代理对象自身传进去
             * @param method 代表当前调用的方法
             * @param args 当前调用方法的参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 编写代码
                String methodName = method.getName();
                if ("sing".equals(methodName)) {
                    System.out.println("啦啦啦啦啦啦");
                    return method.invoke(person, args);
                } else if ("dance".equals(methodName)) {
                    System.out.println("哈哈哈哈哈哈");
                    return method.invoke(person, args);
                } else {
                    System.out.println("哈哈哈哈哈哈");
                }

                return null;
            }
        });
    }

}
