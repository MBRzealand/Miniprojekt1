import jdk.swing.interop.SwingInterOpUtils;
//Made By Anders Hjordrup Larsen
import java.lang.Math;
import java.util.Scanner;





public class LottoTal {

    public static void main(String[] args) {
//start Scanner
        Scanner input = new Scanner(System.in);

//Udskriv en velkomst hilsen.
        System.out.println("Velkommen til Lottotal generatoren");
        System.out.println("Tast 1 for at få dine LottoTal");

        short start = input.nextShort();


        if (start == 1) {
            System.out.println("Dinne 10 Lottotal er ");


// Træk de random tal
            for (int i = 0; i < 10; i++) {


                double randomNum = Math.random() * (36 - 1 + 1) + 1;

                System.out.print((int) randomNum + " ");

            }


        }else{
            System.out.println("Forkert input");

        }
    }
}





