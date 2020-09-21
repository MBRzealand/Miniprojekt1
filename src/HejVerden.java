import java.util.Locale;

public class HejVerden {
    static void HejVerden(){
        Locale currentLocale = Locale.getDefault();
        //Tjekker computerens locale setting
        if (currentLocale.getISO3Language().equals("dan")) {
            System.out.println("Hej Verden!");
        } else System.out.println("Hello World!");
    }
}
