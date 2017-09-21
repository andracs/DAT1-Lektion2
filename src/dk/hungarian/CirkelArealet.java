package dk.hungarian;

import java.util.Scanner;

public class CirkelArealet {
    public static void main(String[] args) {

        String navn;
        navn = "Jesper";

        int tal;
        tal = 5;

        double decimalTal;
        decimalTal = 9.0;

        char bogstav;
        bogstav = 'B';


        System.out.println("Welcome to Java"); // Bar for at se, at det virker
        // System.out.println(1 / 0); // Her er et eksempel på en runtime fejl
        System.out.print("Enter a number for radius: "); // Viser en besked på skærmen

        /* De næste tre linjer "scanner" for brugerens indtastning  */
        Scanner input = new Scanner(System.in);  // Vi SKAL bruge Scanner for at kunne bede om indtastning
        double radius = 0; // En ny variable, som kommer til at indeholde radius
        radius = input.nextDouble(); // Indlæser et nyt tal fra brugeren i var radius

        System.out.println("Radius er " + radius); // Det udskriver radius

        double resultat = 0;
        resultat = radius * radius * 3.14;
        System.out.println("Arealet er " + resultat + " for radius " + radius +". \n");

    }
}
