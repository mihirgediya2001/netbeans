/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author HP
 */
public class SpecialLL<E> {

    Node<E> head, tail;
    int size = 0;

    public SpecialLL() {
    }

    public int getSize() {
        return size;
    }
    
    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if(tail == null)
        {
            tail = head;
        }
    }
    
    public void addLast(E e){
        Node<E> newNode = new Node<>(e);
        if(tail == null ){
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }
    
    public void print() {
        Node<E> current = head;
        for(int i=0;i<size;i++)
        {
            System.out.println(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }
}
