import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/09/2020
 */

public class MiniComputer {

    public static void main(String[] args) {

        System.out.println("Velkommen til minicomputer!\nPick a program with the following numbers:");
        System.out.println("\n\n");
        System.out.println("\n1. Terninge Kast \n2. Renters Rente\n3. ASCII Art \n4. Convert \n5. Rock Paper Scissors \n6. Close Computer");

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.print("Hvilket miniprogram vil du køre [1..9]? ");

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


