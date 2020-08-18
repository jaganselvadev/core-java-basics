package com.final_static;

class Singleton
{
    private static Singleton onlyObject;
    
    public static Singleton getInstance()
    {
        if(onlyObject == null)
        {
            onlyObject = new Singleton();
        }
        return onlyObject;
    }

    private Singleton()
    {
    }

    public void doSomeAction()
    {
    	System.out.println("hello");
    }
}

class A
{
    void method1()
    {
        Singleton s = Singleton.getInstance();
        s.doSomeAction();
    }
}

class B
{
    void method2()
    {
        Singleton.getInstance().doSomeAction();
    }
}