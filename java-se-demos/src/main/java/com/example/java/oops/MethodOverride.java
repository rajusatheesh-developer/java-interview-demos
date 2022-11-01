package com.example.java.oops;

public class MethodOverride
{

        public void method(Object a)
        {
            System.out.println("object");

        }

        public void method(String a)
        {
            System.out.println("string");

        }

        public static void main(String[] args)
        {
            MethodOverride a=new MethodOverride();
            a.method(null);

        }


}
