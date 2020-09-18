import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/09/2020
 */

public class MiniComputer {

    public static void main(String[] args) {

        System.out.println("\nVelkommen til minicomputer!\n\nVælg et program med tallene:");
        System.out.println("\n1. Terninge Kast \n2. Renters Rente\n3. ASCII Kunst \n4. Konverter \n5. Rock Paper Scissors \n6. Luk Computer");

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.print("\nHvilket miniprogram vil du køre [1..9]? ");

            int x = input.nextInt();

            if ( x == 1) {
                RentersRente.main(null);

            }
            // Dine if sætninger skal komme her
            // Bil.dyt();

        }

        System.out.println("Farvel!");

    }

}


