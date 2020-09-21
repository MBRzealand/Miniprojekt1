import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/09/2020
 */

public class MiniComputer {
    /**
     metode der returnere true eller false
     */
    static boolean spørgigen()   {
        System.out.println("Vil du prøve et andet program? Tast [Y/N]");
        Scanner input = new Scanner(System.in);
        boolean flipped = true;
        /**Løkke der kører indtil brugeren enten vælger Y eller N, hvis imnput ikke er gyldigt
        så bliver det fanget enten i else klausen, eller i catch'n hvis det er en runtime fejl.
         */
        while (flipped) {
            try {
                String svar = input.nextLine().toLowerCase();
                if (svar.equals("y")) {
                    System.out.println("Vælg et program");
                    return true;
                } else if (svar.equals("n")) {
                    return false;
                } else {
                    System.out.println("Ikke et gyldigt input, tryk Y eller N");
                    return spørgigen();
                }
            //Fanger runtime fejl, integer input udløser den f.eks
            } catch (Exception e) {
                System.out.println("Forkert input. Skriv enten Y eller N");
                input.next();
            }
        }
        return true;
    }
    /**
        Computeres kontrolflow styres fra valg metoden.
     */
    static int valg() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nVelkommen til minicomputer!\n\nVælg et program med tallene:");
        Boolean flipped = true;
        int x;
        while (flipped) {
            System.out.println("\n1. Terninge Kast\n2. Renters Rente\n3. LottoTal\n4. Konverter\n5. Rock Paper Scissors\n6. ConvertSec\n" +
                    "7. Choose Your Own Adventure\n8. Hej Verden\n9. Talgætter\n10. ASCII Art\n11. Find Vokaler\n12. Jokes\n13. Sluk minicomputer.");
            try {
                x = input.nextInt();
                //Switch expression, modtager kun integers som input, alt andet bliver fanget i try/catch
                switch (x) {
                    case 1 -> Terning.main(null);
                    case 2 -> RentersRente.main(null);
                    case 3 -> LottoTal.main(null);
                    case 4 -> Convert.main(null);
                    case 5 -> StenSaksPapir.main(null);
                    case 6 -> ConverSec.main(null);
                    case 7 -> CYOAdventure.main(null);
                    case 8 -> HejVerden.main(null);
                    case 9 -> TalGaetter.main(null);
                    case 10 -> ASCII_Art.main(null);
                    case 11 -> Findvokaler.main(null);
                    case 12 -> Jokes.main(null);
                    case 13 -> {
                        System.out.println("Farvel");
                        return 0;
                    }
                    default -> System.out.println("Vælg et af de givne muligheder..");
                }

            } catch (Exception e) {
                System.out.println("Du kom ikke med et tal..");
                input.next();
            }
            //sætter flipped lig true eller false
            flipped = spørgigen();
        }
        System.out.println("Farvel");
        return 0;
    }

    public static void main(String[] args) {
        valg();
    }
}



