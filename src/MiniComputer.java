import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/09/2020
 */

public class MiniComputer {
    static boolean igen() {
        System.out.println("Vil du prøve et andet program? Tast [Y/N]");
        Scanner input = new Scanner(System.in);
        boolean flipped = true;
        while (flipped) {
            try {
                String svar = input.nextLine().toLowerCase();
                if (svar.equals("y")) {
                    System.out.println("Vælg et program");
                    return true;
                } else if (svar.equals("n")) {
                    return false;
                } else {
                    System.out.println("Ikke et validt input, tryk Y eller N");
                    return igen();
                }
            } catch (Exception e) {
                System.out.println("Forkert input. Skriv enten Y eller N");
                input.next();
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nVelkommen til minicomputer!\n\nVælg et program med tallene:");
        Boolean flipped = true;
        int x;
        while (flipped) {
            System.out.println("\n1. Terninge Kast\n2. Renters Rente\n3. LottoTal\n4. Konverter\n5. Rock Paper Scissors\n6. ConvertSec\n" +
                    "7. Choose Your Own Adventure\n8. Hej Verden\n9. Talgætter\n10. ASCII Art\n11. Find Vokaler\n12. Jokes\n13. Sluk minicomputer.");
            try {
                x = input.nextInt();
                switch (x) {
                    case 1:
                        Terning.main(null);
                        flipped = igen();
                        break;
                    case 2:
                        RentersRente.main(null);
                        flipped = igen();
                        break;
                    case 3:
                        LottoTal.main(null);
                        flipped = igen();
                        break;
                    case 4:
                        Convert.main(null);
                        flipped = igen();
                        break;
                    case 5:
                        StenSaksPapir.main(null);
                        flipped = igen();
                        break;
                    case 6:
                        ConverSec.main(null);
                        flipped = igen();
                        break;
                    case 7:
                        CYOAdventure.main(null);
                        flipped = igen();
                        break;
                    case 8:
                        HejVerden.main(null);
                        flipped = igen();
                        break;
                    case 9:
                        TalGaetter.main(null);
                        flipped = igen();
                        break;
                    case 10:
                        ASCII_Art.main(null);
                        flipped = igen();
                        break;
                    case 11:
                        Findvokaler.main(null);
                        flipped = igen();
                        break;
                    case 12:
                        Jokes.main(null);
                        flipped = igen();
                        break;
                    case 13:
                        flipped = false;
                        break;
                    default:
                        System.out.println("Vælg et af de givne muligheder..");
                        break;
                }
            } catch(Exception e){
                System.out.println("Du kom ikke med et tal.. Prøv igen");
                input.next();
            }
        }
        System.out.println("Farvel");
        }
    }


