package com.company;

public class Main {

    public static void main(String[] args) {

        One one = new One(3.7,6,15);
        Two two = new Two();
        Three three = new Three();

        System.out.println(one.arithmetic());
        System.out.println(two.arithmetic(3));
        System.out.println(three.arithmetic(45,15,2));




    }
}
