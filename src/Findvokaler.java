import java.util.Scanner;
//Made By Anders Hjordrup Larsen

public class Findvokaler {

    public static void ord() {


        // Opsæt variabler:
        String Ord;
        char ch;
        int i = 0;

        // start Scanner
        Scanner input = new Scanner(System.in);
        // promt bruger til at indtast et ord.

        System.out.println("Indtast det ord du vil finde vokaler i ");

        // Sæt Ord til at være det indtastet ord:
        Ord = input.next();

        // Fortæl brugeren hvor mange vokalr der er i deres ord.
        System.out.println("Der er følgende vokalker i dit ord ");
        for (int j = 0; j < Ord.length(); j++) {

            ch = Ord.charAt(j);
            switch (ch)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'æ':
                case 'ø':
                case 'å':
                case 'Æ':
                case 'Ø':
                case 'Å':
                    i = 1;
                    System.out.println(ch);
            }
        }
        if (i == 0)
            System.out.println("Der er ingen vokaler i dit ord");


    }
    }













