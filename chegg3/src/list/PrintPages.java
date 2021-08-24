/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PrintPages {

    public static void main(String[] args) {
        SpecialLL<Integer> bookPage = new SpecialLL<>();
        ArrayList<Integer> selectedList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting page: ");
        int start = input.nextInt();
        System.out.print("Enter number of pages: ");
        int page = input.nextInt();
        for (int i = start; i - start < page; i++) {
            bookPage.addLast(i);
        }

        bookPage.print();
    }
}
