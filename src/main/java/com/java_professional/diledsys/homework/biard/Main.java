package com.java_professional.diledsys.homework.biard;

public class Main {
    public static void main(String[] args) {
        Biard biard1 = new Biard("vorobey", "gray", 5);
        Biard biard2 = null;
        //try {
        biard2 = biard1.clone();
        // } catch (CloneNotSupportedException e) {
        //   e.printStackTrace();
        // }
        //console output
        System.out.println("biard1 = " + biard1.toString());
        System.out.println("deep clon biard2 = " + biard2.toString());
        biard2.setColor("blue");
        System.out.println("---сетим цвет в клон---------------------");
        System.out.println(" biard1 = " + biard1.toString());
        System.out.println("deep clon biard2 = " + biard2.toString());
    }
}
