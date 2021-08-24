/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mark$2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        
        List<String> names = new ArrayList<>();
        List<Integer> marks = new ArrayList<>();
        
        int names_count =0;
        int marks_count=0;
        String temp="";
        int mtemp=0;
        
        // sentinal while loop to take names of students
        while(!temp.equals("@@"))
        {
            System.out.print("Enter First Name of Student " + (names_count+1) + " : ");
            names_count++;
            temp = input.next();
            names.add(temp);
        }
        
        System.out.println();
        //sentinal while loop to take marks of students
        while(mtemp != -111)
        {
            System.out.print("Enter Marks of Student " + (marks_count+1) + " : ");
            mtemp = input.nextInt();
            marks.add(mtemp);
            marks_count++;
        }
        System.out.println();
        // for loop to print the output
        for(int i=0;i<marks_count-1 && i<names_count-1;i++)
        {
            System.out.println(names.get(i)+" "+marks.get(i));
        }
    }
}

