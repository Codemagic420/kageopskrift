package Ingredienser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //opskrift til 5 personer
        Opskrift brownieOpskrift = new Opskrift();
        brownieOpskrift.createIngredienser();
        brownieOpskrift.printOpskrift();

        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);//for at brugeren kan indtaste input
        System.out.println("Indtast antal personer");
        int antalPersoner = scanner.nextInt(); //her bliver antalPersoner lavet i en s

        System.out.println("Du skal bruge følgende:");
        brownieOpskrift.printTabel(antalPersoner);
    }
}
