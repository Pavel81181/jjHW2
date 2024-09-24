package org.example.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
    Class<?> person = Class.forName("org.example.task1.Person");
        Field[] fields = person.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " +field.getName());

        }
        Constructor[] constructors = person.getConstructors();


        Object personInstance = constructors[0].newInstance(null);


        Field nameField = person.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(personInstance, "Pavel");

        Field ageField = person.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(personInstance, 42);

        Method info = person.getDeclaredMethod("displayInfo");
        info.invoke(personInstance);

    }
}
