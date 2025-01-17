package org.example;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    private String name ;
    private Integer age;
    private static List<TestClass> testClassList = new ArrayList<>();

    public TestClass(){
       name = "a";
       age = 1;
    }

    public String getName() {
        return name;
    }

    public synchronized void  setName(String name) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("SET NAME PROCESSING WITH NAME: " + name);

        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static List<TestClass> getTestClassList(){
        return testClassList;
    }


}
