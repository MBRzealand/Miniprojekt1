import java.util.Scanner;
//Made By Anders Hjordrup Larsen
public class Convert {

    public static void money() {


        //Promt user to input and amount.

        Scanner input = new Scanner(System.in);
        System.out.println("What amount do you wanna convert in Euro ? ");


        //Here we store the amount as a variable.
        double euroAmount = input.nextDouble();

        //Here we convert the euro to dkk
        double amountInDKK = (euroAmount * 7.44);

        System.out.println(euroAmount + " € is " + amountInDKK + " DKK");


    }

}