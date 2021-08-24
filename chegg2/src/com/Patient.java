package com;

import java.util.ArrayList;

class Patient extends Animal {

    int pen;
    ArrayList<Veterinarian> vets;

    // contructor with three arguments
    // it initialze the value of pen and ArrayList
    public Patient(String name, String type, String number) {
        super(name, type, number);
        pen = -1;
        vets = new ArrayList<>();
    }

    public int getPen() {
        return pen;
    }

    public void setPen(int pen) {
        this.pen = pen;
    }

    public void addGeneralVeterinarian(Veterinarian v) {
        vets.add(v);
        pen++;

    }

    public void removeGeneralVeterinarian(String name) {
        if (pen == -1) {
            System.out.println("Veterinarian list is empty.\nCan not remove Veterinarian");
        } else {
            for (int counter = 0; counter < vets.size(); counter++) {
                if (vets.get(counter).name == null ? name == null : vets.get(counter).name.equals(name)) {
                    vets.remove(vets.get(counter));
                }
            }
        }
    }

    public boolean hasGeneralVeterinarian(String name) {
        if (pen == -1) {
            System.out.println("Veterinarian list is empty.\nCan not remove Veterinarian");
            return false;
        } else {
            for (int counter = 0; counter < vets.size(); counter++) {
                if (vets.get(counter).name == null ? (name) == null : vets.get(counter).name.equals(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String output = "";
        for (int counter = 0; counter < vets.size(); counter++) {
            output += vets.get(counter).name;
            if (counter == vets.size() - 1) {
                output += "\n";
            } else {
                output += ", ";
            }
        }
        System.out.print(super.toString());
        return "pen: " + pen + "\nVeterinarian List: " + output;
    }
}
