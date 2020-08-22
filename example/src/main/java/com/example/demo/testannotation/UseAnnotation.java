package com.example.demo.testannotation;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:ty
 * 2020/8/5
 */
@TestA(name="type",gid = Long.class)  //此处使用类注解
public class UseAnnotation {
    @TestA(name="param",id=1,gid = Long.class) //此处使用变量注解
    private Integer age;

    @TestA(name="construct",id=2,gid = Long.class) //此处使用构造方法注解
    public UseAnnotation(){

    }

    @TestA (name="public method",id=3,gid=Long.class)//此处使用类方法注解
    public void a(){
        //@TestA  此处使用局部变量注解
        Map m=new HashMap(0);
    }

    @TestA (name="protected method",id=4,gid=Long.class)//此处使用类方法注解
    protected void b(){
        //@TestA  此处使用局部变量注解
        Map m=new HashMap(0);
    }

    @TestA (name="private method",id=5,gid=Long.class)//此处使用类方法注解
    private void c(){
        //@TestA  此处使用局部变量注解
        Map m=new HashMap(0);
    }



    public  void b( Integer a){// @TestA 使用了方法参数注解

    }

}
