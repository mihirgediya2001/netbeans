/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chegg1;

/**
 *
 * @author HP
 */
public class Student {

    private String name;
    private double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return (name);
    }

    public double getMarks() {
        return (marks);
    }

    public String toString() {
        return "Name="+name+"\nMarks="+marks;
    }
}