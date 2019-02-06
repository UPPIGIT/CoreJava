package com.corejava.InheritenceDemo;
class X
{
    static
    {
        Y.methodOfY();
    }
    
    {
    	Y.methodOfY();
    }
}
class Y extends X
{
    static void methodOfY()
    {
        System.out.println("Hi....");
    }
}
public class MainClass
{
    public static void main(String[] args)
    {
        Y.methodOfY();
        Y y = new Y();
    }
}
