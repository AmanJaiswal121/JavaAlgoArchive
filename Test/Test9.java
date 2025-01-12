package Test;

import java.util.Scanner;

class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
        System.out.println(name);
        System.out.println("Inisde co");
        {
            int x = 10;
            System.out.println(x);
        }
    }
}

class Dog extends Animal {
    private String bred;

    Dog(String bred) {
        super("Unkno");
        this.bred = bred;
        System.out.println(bred);
    }
}

public class Test9 {
    public static void main(String[] args) {
        System.out.println("main method statred");

        Dog d = new Dog("Dhruv Rathi");
        

        System.out.println("main method ended");
    }
}
