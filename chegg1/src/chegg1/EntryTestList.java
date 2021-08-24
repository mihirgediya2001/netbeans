/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chegg1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HP
 */
public class EntryTestList {

    HashMap<Integer, Student> MeritList = new HashMap<>();

    public void addStudent(int rollno, String name, double marks) {
        MeritList.put(rollno, new Student(name, marks));
    }

    public void generateMeritLit(int merit) {
        MeritList.entrySet().forEach((Map.Entry<Integer, Student> m) -> {
            Student temp = (Student) m.getValue();
            
            String name = temp.getName();
            double marks = temp.getMarks();
            if (temp.getMarks() > merit) {
                System.out.println("Name:" + name + "\nmarks: "+marks);
            }
        });
    }
}
