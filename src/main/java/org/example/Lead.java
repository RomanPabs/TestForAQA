package org.example;

public class Lead {
    String name;

    public Lead(String name) {
        this.name = name;
    }

    public static void changeName(Lead l){
        l.name = "Anna";
    }

    public static void main(String[] args) {
        Lead lead = new Lead("Roman");

        System.out.println("Старое имя: " + lead.name);
        changeName(lead);
        System.out.println("Новое имя: " + lead.name);



    }





}
