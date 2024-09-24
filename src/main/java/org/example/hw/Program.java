package org.example.hw;

import java.lang.reflect.Method;

public class Program {
    public static void main(String[] args) {
        Class<?> stringClass = String.class;
        Method[] methods = stringClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

    }
}
