/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkList;

//Cricket Class
class Cricket {

    Cricket(int a, int b, char c) {
        System.out.println("In Cricket class");
    }

}

// Football Class
class Football extends Cricket {

    Football(int a, char c) {
        // Football class inherits Cricket so we have call Cricket class constuctor.
        super(1, 2, 'a');
        System.out.println("In Football Class");
    }
}

class Badminton extends Football {

    Badminton(int a, char c) {
        // Badminton class inherits Football so we have call Football class constuctor.
        super(a, c);
        System.out.println("In badminton Class");
    }
}

public class Main {

    public static void main(String[] args) {
        Cricket c = new Cricket(1, 2, 'c');
        System.out.println();
        Football f = new Football(1, 'f');
        System.out.println();
        Badminton b = new Badminton(1, 'b');

    }
}
