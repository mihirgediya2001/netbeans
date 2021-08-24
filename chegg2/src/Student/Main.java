package Student;

import java.util.ArrayList;
import java.util.Scanner;

class StudentRecordList {

    static ArrayList<StudentRecord> studentList = new ArrayList<>();
}

class Car {
    String owner;
    String color;
    int year;
}
class StudentRecord {

    private int id;
    private String name;
    private String course;

    public StudentRecord() {
    }

    public StudentRecord(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void Add(StudentRecord studentRecord) {
        StudentRecordList.studentList.add(studentRecord);
        System.out.println("the student has been added successfully.");
    }

    public void View(int id) {
        for (StudentRecord student : StudentRecordList.studentList) {
            if (student.id == id) {
                System.out.println("Student Details");
                System.out.println("ID: " + student.id);
                System.out.println("Name: " + student.name);
                System.out.println("Course: " + student.course);
            }
        }
    }
    
    public void Update(int id,StudentRecord studentRecord) {
        for (StudentRecord student : StudentRecordList.studentList) {
            if (student.id == id) {
                student.id = studentRecord.id;
                student.name = studentRecord.name;
                student.course = studentRecord.course;
            }
        }
        System.out.println("the student record has been updated successfully.");
    }
    
    public void Delete(int id) {
        for (StudentRecord student : StudentRecordList.studentList) {
           
            if (student.id == id) {
                StudentRecordList.studentList.remove(student);
                break;
            }
        }
        System.out.println("the student record has been deleted successfully.");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentRecord studentRecord = new StudentRecord();
        int option, id, updateID;
        String name, course;
        do {
            System.out.println("STUDENT RECORD MENU");
            System.out.println("[1] Add");
            System.out.println("[2] View");
            System.out.println("[3] Update");
            System.out.println("[4] Delete");
            System.out.print("option: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("ID: ");
                    id = input.nextInt();
                    System.out.print("Name: ");
                    name = input.next();
                    System.out.print("Course: ");
                    course = input.next();
                    studentRecord.Add(new StudentRecord(id, name, course));
                    break;
                case 2:
                    System.out.print("View ID: ");
                    id = input.nextInt();
                    studentRecord.View(id);
                    break;
                case 3:
                    System.out.print("Update ID: ");
                    updateID = input.nextInt();
                    System.out.println("Student Details");
                    System.out.print("ID: ");
                    id = input.nextInt();
                    System.out.print("Name: ");
                    name = input.next();
                    System.out.print("Course: ");
                    course = input.next();
                    studentRecord.Update(updateID,new StudentRecord(id, name, course));
                case 4:
                    System.out.print("Delete ID: ");
                    id = input.nextInt();
                    System.out.print("Delete Student Record woth ID: " + id + " [YES/NO]?: ");
                    String choice;
                    choice = input.next();
                    if(choice.equals("yes"))
                    {
                        studentRecord.Delete(id);
                    }
                default:
                    break;
          
            }
        }while(option >= 1 || option <= 4);

    }
}
