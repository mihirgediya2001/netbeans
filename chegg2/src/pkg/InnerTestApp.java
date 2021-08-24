/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import pkg.ItemInfo.Contact;

/**
 *
 * @author HP
 */
class ItemInfo {

    long ID;

    String name;

    ItemInfo(long id, String nm) {        // Arguments
        ID = id;
        name = nm;
    }

    void printItemInfo() {
        System.out.println("ID: " + ID + ", name: " + name);      // print info
    }

    class Contact {      // inner class starts here

        // Here There is change
        // There is company instead of madeBy
        String company, country;

        Contact(String comp, String ctry) {     // Arguments
            company = comp;
            country = ctry;
        }

        public void printContact() {
            System.out.println("Company: " + company + ", country: " + country);     // print contact
        }

    }   // end of inner class

} // end of outer class

public class InnerTestApp {

    public static void main(String[] args) {   // Arguments

        // Create new object obj of the ItemInfo class using values 222, “Table”
        ItemInfo obj = new ItemInfo(222, "Table");

        // Create new object in of the inner class Contact using values “Ikea”, “Sweden”
        ItemInfo.Contact in = obj.new Contact("Ikea", "Sweden");

        // Call printItemInfo () method on outer object
        obj.printItemInfo();

        // Call printContact () method on inner object
        in.printContact();

    } //end of main

} //end of app class
