import java.util.Scanner;
import java.util.Random;


public class StenSaksPapir {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Lad os spille sten saks papir");
        Scanner input = new Scanner(System.in);

        String PlayerPlay = " ";
        int x = input.nextInt();

        String computerPlay = " ";
        Random generator = new Random();

        int computerInt = generator.nextInt();
        if(computerInt == 1) {
            computerPlay = "Sten";
        }else if (computerInt == 2){
            computerPlay = "Saks";
        }else if (computerInt == 3);
            computerPlay = "Papir";

        System.out.println("Computeren vælger: " + computerPlay);
    }

}