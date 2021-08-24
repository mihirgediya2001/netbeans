/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import java.util.Scanner;

public class Mark$ {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int number_of_students=25;
        String[] names = new String[number_of_students];
        int[] marks = new int[number_of_students];
        
        // for loop to take input
        for(int i=0;i<number_of_students;i++)
        {
            System.out.print("Enter first name and marks of Student "+ (i+1)+" : ");
            
            names[i] = input.next();
            marks[i] = input.nextInt();
        }
        
        // for loop to print the output
        for(int i=0;i<number_of_students;i++)
        {
            System.out.println(names[i]+" "+marks[i]);
        }
    }
}
