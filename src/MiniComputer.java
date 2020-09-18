import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/09/2020
 */

public class MiniComputer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            Boolean flipped = true;
            while (flipped) {
                System.out.println("\nVelkommen til minicomputer!\n\nVælg et program med tallene:");
                System.out.println("\n1. Terninge Kast\n2. Renters Rente\n3. LottoTal\n4. Konverter\n5. Rock Paper Scissors\n6. ConvertSec\n" +
                        "7. Choose Your Own Adventure\n8. Hej Verden\n9. Talgætter\n10. ASCII Art\n11. Find Vokaler\n12. Jokes\n13. Sluk minicomputer.");
                int x = input.nextInt();

                switch (x) {
                    case 1:
                        Terning.main(null);
                        break;
                    case 2:
                        RentersRente.main(null);
                        break;
                    case 3:
                        LottoTal.main(null);
                        break;
                    case 4:
                        Convert.main(null);
                        break;
                    case 5:
                        StenSaksPapir.main(null);
                        break;
                    case 6:
                        ConverSec.main(null);
                        break;
                    case 7:
                        CYOAdventure.main(null);
                    case 8:
                        HejVerden.main(null);
                        break;
                    case 9:
                        TalGaetter.main(null);
                        break;
                    case 10:
                        ASCII_Art.main(null);
                        break;
                    case 11:
                        Findvokaler.main(null);
                        break;
                    case 12:
                        Jokes.main(null);
                        break;
                    case 13:
                        flipped = false;
                        System.out.println("Farvel!");
                        break;
                    default:
                        System.out.println("Vælg et af de givne muligheder..");
                        break;
                }
            }
        }
    }


