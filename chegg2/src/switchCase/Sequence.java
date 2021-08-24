/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchCase;

import java.util.Scanner;

public class Sequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n = input.nextInt();
        sequence(n);
    }

    public static void sequence(int n) {
        System.out.print(n + " ");
        if (n == 1) {
            System.out.println();
            return;
        } else if (n % 2 == 0) {
            // if number is even then call function for n/2
            sequence(n / 2);
        } else {
            // if number is even then call function for 2*n+2
            sequence(2 * n + 2);
        }
    }
}
