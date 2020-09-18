import java.util.Scanner;
// Made by Kim

public class Jokes {

    public static void main(String[] args) {

        vittigheder();


    }
    public static void vittigheder(){

        //Promt the user to enter a number between 1-3

        System.out.println(" Indtast et nummer mellem 1-3 ");

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        if (x==1) System.out.println(" Kids are delivered by stork… Fat kids are delivered by crane\n ");
        if (x==2) System.out.println(" What genre of music are national anthems? Country..\n ");
        if (x==3) System.out.println(" What has 4 letters, sometimes has 9 letters, but never has 5 letters.\n ");

    }
}
