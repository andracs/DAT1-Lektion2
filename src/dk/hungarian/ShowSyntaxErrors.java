package dk.hungarian;

import java.util.Scanner;

public class ShowSyntaxErrors {
    public static void main(String[] args) {
        System.out.println("Welcome to Java"); // Bar for at se, at det virker
        // System.out.println(1 / 0); // Her er et eksempel på en runtime fejl
        System.out.print("Enter a number for radius: "); // Viser en besked på skærmen

        /* De næste tre linjer "scanner" for brugerens indtastning  */
        Scanner input = new Scanner(System.in);  // Vi SKAL bruge Scanner for at kunne bede om indtastning
        double radius = 0; // En ny variable, som kommer til at indeholde radius
        radius = input.nextDouble(); // Indlæser et nyt tal fra brugeren i var radius

        System.out.println("Radius er " + radius); // Det udskriver radius


    }
}