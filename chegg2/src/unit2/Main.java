/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
        GradeBook gb = new GradeBook("Java Programming", GradeBookArray.sendArray());

        gb.displayMessage();
        gb.processGrades();
    }

}
