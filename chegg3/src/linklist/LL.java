/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

/**
 *
 * @author HP
 */
class Node {

    public int data;
    public Node next;

    public Node(int d, Node n) {
        data = d;
        next = n;
    }
}

class LinkedList {

    Node top;

    public LinkedList() {
        top = null;
    }

    // add data into list
    public void add(int data) {
        Node newNode = new Node(data, null);
        Node curr = top;
        if (top == null) {
            top = newNode;
        } else {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    // print list
    public void printList() {
        Node curr = top;
        Node prev = top;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    // modify list
    public void modifyList() {

        // curr to mark current position
        Node curr = top;

        // loop through whole list
        while (curr != null) {

            // for odd numbers
            if (curr.data % 2 == 1) {
                // If current node is top
                if (curr == top) {
                    // set top to the next node
                    top = curr.next;
                    curr = curr.next;
                } else {
                    //find previous of current node
                    Node prev = top;
                    while (prev.next.data != curr.data) {
                        prev = prev.next;
                    }

                    // set next of previous node to next of current node
                    prev.next = curr.next;

                    // set next of current node to null
                    curr.next = null;
                    curr = prev.next;
                }
            } // for even numbers
            else {
                //make new node
                Node newNode = new Node(curr.data, curr.next);

                //set it next to current node
                curr.next = newNode;
                curr = newNode.next;
            }
        }
    }
}

public class LL {

    public static void main(String[] args) {
        LinkedList test = new LinkedList();

        // Insert into list
        test.add(1);
        test.add(4);
        test.add(7);
        test.add(5);
        test.add(2);
        test.add(8);

        System.out.println("Original data into list: ");
        test.printList();
        System.out.println();

        System.out.println("\nModified list: ");
        // call modify method
        test.modifyList();

        // print modified list
        test.printList();
        System.out.println();
        
    }
}
