package com.driver;

public class Main {

    static class A{
        void meth()
        {
            System.out.println("Invoking method from class A");
        }
    }
    public static  class B extends A
    {

        void meth()
        {
            System.out.println("Method is overridden in Extendend class B");
        }

    }
    public static void main(String[] args)
    {
        A obj = new A();
        obj.meth();

        B ob = new B();
        ob.meth();

    }
  
}