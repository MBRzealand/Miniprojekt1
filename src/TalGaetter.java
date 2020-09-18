import java.util.Scanner;

public class TalGaetter {

    static boolean gaetNummer(int start, int slut) {
        Scanner scan = new Scanner(System.in);

        int mid = (start + slut)/2;
        System.out.println("Er tallet " + mid + "? (Skriv Ja eller Nej)");
        String svar = scan.nextLine().toLowerCase().strip();

        if (svar.equals("ja")){
            System.out.println("Det var alt for nemt");
            return false;
        } else if (svar.equals("nej")) {
            System.out.println("Er tallet større end " + mid + "?");
            svar = scan.nextLine().toLowerCase().strip();
        } else {
            System.out.println("Du skal svare ja eller nej");
            return gaetNummer(start, slut);
        }
        if (svar.equals("ja")){
            return gaetNummer(mid+1, slut);
        } else if (svar.equals("nej")){
            return gaetNummer(start, mid-1);
        } else {
            System.out.println("Du skal svare ja, eller nej");
            return gaetNummer(start, slut);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hej, velkommen til talgætter-spillet!\nVælg et helt tal imellem 0 og 1000, og så bruger jeg nogle forsøg på at gætte tallet");
        gaetNummer(1, 1000);
    }
}
