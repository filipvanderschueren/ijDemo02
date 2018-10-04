package be.ua.fti;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here
        System.out.printf("start of program \n\n");
        //gegevens
        Lijst naamLijst = new Lijst();      //lijst van personen
        Scanner scanner = new Scanner( System.in );
        int teller = 0;

        while (teller <=5) {                    //we lezen 10 personen in
            System.out.println("enter a name :");
            String newName = scanner.nextLine();
            System.out.println("input = " + newName);

            Persoon p = new Persoon(newName);   //nieuwe persoon
            naamLijst.voegToe(p);               //voeg hem toe
            teller++;

        }
        System.out.printf(naamLijst.drukAf());
    }
}
