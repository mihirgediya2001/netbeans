package com;

class Animal {

    private String name;
    private String type;
    private String registrationNumber;

    public Animal(String aName, String aType, String aNumber) {
        this.name = aName;
        this.type = aType;
        this.registrationNumber = aNumber;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setName(String newName) {
        name = newName;
    }

    @Override
    public String toString() {
        return "\nName: " + this.name + "\nType: " + this.type + "\nRegistration number: " + this.registrationNumber + "\n";
    }
}
