import java.util.Scanner;
//Made By Anders Hjordrup Larsen
public class ConverSec {


   public static void ConvertSec() {

Scanner input = new Scanner(System.in);

// Ask how many sec he wants to convert

        System.out.println("Hvor mange sekunder vil konvertere til timer ?");

// store seconds as a variable


        double seconds = input.nextDouble();

// convert seconds to hours


        double hours = (seconds/60)/60;

// print the amount of hours it adds up to.
        System.out.println(seconds + " Sekunder svare til " + hours + " timer");







    }




}
