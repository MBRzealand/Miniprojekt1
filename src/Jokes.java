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

        if (x==1) System.out.println(" I'm a big fan of whiteboards. I find them quite re-markable.\n ");
        if (x==2) System.out.println(" What genre of music are national anthems? Country..\n ");
        if (x==3) System.out.println(" Two guys stole a calendar. They got six months each.\n ");

    }
}
