import java.util.Scanner;
import java.util.Random;


public class StenSaksPapir {


    public static void stenSaksPapir() {
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


    if (playerPlay.equals(computerPlay)){
        System.out.println("Det blev uafgjort");
    }else if(playerPlay.equals("Sten") && computerPlay.equals("Saks")) {
        System.out.println("Du vandt");
    }else if (playerPlay.equals("Sten") && computerPlay.equals("Papir")){
        System.out.println("du tabte");
    }else if(playerPlay.equals("Saks") && computerPlay.equals("Sten")){
        System.out.println("Du tabte");
    }else if (playerPlay.equals("Saks") && computerPlay.equals("Papir")){
        System.out.println("du vandt");
    }else if(playerPlay.equals("Papir") && computerPlay.equals("Saks")){
        System.out.println("Du tabte");
    }else if (playerPlay.equals("Papir") && computerPlay.equals("Sten")){
        System.out.println("du vandt");
    }
}
}









