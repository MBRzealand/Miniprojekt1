import javax.swing.*;
import java.util.Scanner;
import java.util.Random;


public class StenSaksPapir {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lad os spille sten saks papir");
        System.out.println("1 = sten  2 = saks 3 = papir");

        String playerPlay = " ";
        int x = input.nextInt();
        if (x == 1){
            playerPlay = "Sten";
        }else if (x == 2){
            playerPlay = "Saks";
        }else if (x == 3){
            playerPlay = "Papir";
        }

        String computerPlay = " ";
        Random generator = new Random();


        int computerInt = generator.nextInt(3)+1;
        if(computerInt == 1) {
            computerPlay = "Sten";
        }else if (computerInt == 2){
            computerPlay = "Saks";
        }else if (computerInt == 3) {
            computerPlay = "Papir";
        }

        System.out.println("Du vælger: " + playerPlay);
        System.out.println("Computeren vælger: " + computerPlay);

    boolean PlayerWon = false;
    if (playerPlay.equals(computerPlay)) {
        System.out.println("Det blev uafgjort");

        /* Hvis det bliver uafgjort printer den stadig "Du tabte" ud
        og den printer "Du tabte ud selvom den burde printe "Du vandt ud
        */

    }if (playerPlay.equals(1)){
    } else if (computerPlay.equals(2)){
        PlayerWon = true;

    }if (computerPlay.equals(3)){
        PlayerWon = false;

    }else if (playerPlay.equals(2)){

    }if (computerPlay.equals(3)){
        PlayerWon = true;

    } else if (computerPlay.equals(1)) {
        PlayerWon = false;
    }

    if (PlayerWon == true) {
            System.out.println("Du vandt");
        }else if (PlayerWon ==false){
            System.out.println("Du tabte");
        }
    }
}









