package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Application {

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("org.example.HelloUniverse");
        SaysHello sh = (SaysHello) clazz.getConstructor().newInstance();
        Method method = clazz.getMethod("sayHello");
        System.out.println(method.invoke(sh));
    }
}
