package org.example;

public class ClassA {
    public static final  String a = "sss1";
    public class ClassB{
        public static Integer b=12;
        String getA(){
            return a;
        }
    }

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassA.ClassB classB = classA.new ClassB();
        System.out.println("f3");
    }
}
