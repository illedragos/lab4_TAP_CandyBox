package com.company;

public class Main {

    public static void main(String[] args) {
        CandyBox box1 = new CandyBox("visine","Italia");
        CandyBox box2 = new CandyBox("visine","Italia");
        CandyBox box3 = new CandyBox("mere","Franta");

        Lindt l1 = new Lindt("portocale","Grecia",2,3,3,10);
        Baravelli b1 = new Baravelli("pere","Romania",1,2,3);
        ChocAmor c1 = new ChocAmor("Banane","Ecuador",2,20);

        System.out.println(l1);
        System.out.println(b1);
        System.out.println(c1);

        System.out.println("box1 = box2?");
        System.out.println(box1.equals(box2));

        System.out.println("box1 = box3");
        System.out.println(box1.equals(box3));

    }
}




