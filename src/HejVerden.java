import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.ResourceBundle;

public class HejVerden {

    public static void main(String[] args){
        Locale currentLocale = Locale.getDefault();
        //Tjekker computerens locale setting
        if (currentLocale.getISO3Language().equals("dan")) {
            System.out.println("Hej Verden!");
        } else System.out.println("Hello World!");

    }
}
