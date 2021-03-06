package com.overriding_overloading;

public class MultiLevelMethodOverriding {
	public static void main(String arg[])
    {
        System.out.println("----------------------------");
        A a = new A();
        a.print();
        System.out.println("----------------------------");
        B b = new B();
        b.print();
        System.out.println("----------------------------");
        C c = new C();
        c.print();
        System.out.println("----------------------------");
        D d = new D();
        d.print();
        System.out.println("----------------------------");
        E e = new E();
        e.print();
        System.out.println("----------------------------");    
    }
}

class A
{
    void print()
    {
        System.out.println("In class A");
    }
}

class B extends A
{
    void print()
    {
        super.print();
        System.out.println("In class B");
    }
}

class C extends B
{
    void print()
    {
        super.print();
        System.out.println("In class C");
    }
}

class D extends A
{
    void print()
    {
        System.out.println("In class D, printing before super class A");
        super.print();
    }
}

class E extends A
{
    void print()
    {
        System.out.println("In class E, not calling the super class method at all.");
    }
}
