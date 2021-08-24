/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chegg2;

class Grandparent {
    public void print1(){
        System.out.println("GP p1");
    }
    public void print2(){
        System.out.println("GP p2");
    }
    public void print3(String s){
        System.out.println("GP p3"+s);
    }
}

class Parent extends Grandparent{
    @Override
    public void print1(){
        super.print2();
        System.out.println("P p1");
    }
    public void print2(String s){
        System.out.println("P p2"+s);
    }
    @Override
    public void print3(String s){
        System.out.println("P p3"+s);
    }
}

class Child extends Parent{
    @Override
    public void print1(){
        super.print2("OOOP");
        super.print2();
        System.out.println("C p1");
    }
}

public class HW3
{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.print1();
    }
}