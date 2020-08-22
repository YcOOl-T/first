package com.example.demo.testannotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Author:ty
 * 2020/8/8
 */
public class ParseAnnotation {

    public static void parseTypeAnnotation() throws ClassNotFoundException {
        Class clazz=Class.forName("com.example.demo.testannotation.UseAnnotation");

        Annotation[] annotations=clazz.getAnnotations();
        for (Annotation annotation:
             annotations) {
            TestA testA=(TestA)annotation;
            System.out.println("id="+testA.id()+";name="+testA.name()+";gid="+testA.gid());
        }

    }

    public static void parseMethodAnnotation(){
        Method[] methods=UseAnnotation.class.getDeclaredMethods();
        for (Method method:
             methods) {
            boolean hasAnnotation=method.isAnnotationPresent(TestA.class);
            if (hasAnnotation){
                TestA annotation=method.getAnnotation(TestA.class);
                System.out.println("method="+method.getName()+" ; id = " + annotation.id() + " ; description = "
                        + annotation.name() + "; gid= "+annotation.gid());
            }
        }
    }

    public static void parseConstructAnnotation(){
        Constructor[] constructors=UseAnnotation.class.getConstructors();
        for (Constructor constructor:
             constructors) {
            boolean hasAnnotation=constructor.isAnnotationPresent(TestA.class);
            if(hasAnnotation){
                TestA annotation= (TestA) constructor.getAnnotation(TestA.class);
                System.out.println("construct="+constructor.getName()+";id="+annotation.id()+";description="+annotation.name()+";gid="+annotation.gid());


            }
            
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        parseTypeAnnotation();
        parseMethodAnnotation();
        parseConstructAnnotation();
    }
}
