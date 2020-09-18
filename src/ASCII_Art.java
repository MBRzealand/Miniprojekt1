import java.util.Scanner;

// Made by Kim

public class ASCII_Art {

    public static void main(String[] args) {

        ASCII_Drawings();

    }

    public static void ASCII_Drawings(){

        //Promt the user to enter a number
        System.out.println(" Indtast et nummer mellem 1-3 forskellig ASCII Art ");

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        if (x == 1) System.out.println("  :                \n" +
                "               ;                \n" +
                "              :                 \n" +
                "              ;                 \n" +
                "             /                  \n" +
                "           o/                   \n" +
                "         ._/\\___,                \n" +
                "             \\                  \n" +
                "             /                   \n" +
                "             `   ");

        if (x==2) System.out.println("   _----------_,\n" +
                "    ,\"__         _-:, \n" +
                "   /    \"\"--_--\"\"...:\\\n" +
                "  /         |.........\\\n" +
                " /          |..........\\\n" +
                "/,         _'_........./:\n" +
                "! -,    _-\"   \"-_... ,;;:\n" +
                "\\   -_-\"        \"-_/;;;;\n" +
                " \\   \\             /;;;;'\n" +
                "  \\   \\           /;;;;\n" +
                "   '.  \\         /;;;'\n" +
                "     \"-_\\_______/;;'");

        if (x==3) System.out.println("L L               /   \\               L L\n" +
                "        __/|/|_             /  .  \\             _|\\|\\__\n" +
                "       /_| [_[_\\           /     .-\\           /_]_] |_\\\n" +
                "      /__\\  __`-\\_____    /    .    \\    _____/-`__  /__\\\n" +
                "     /___] /=@>  _   {>  /-.         \\  <}   _  <@=\\ [___\\\n" +
                "    /____/     /` `--/  /      .      \\  \\--` `\\     \\____\\\n" +
                "   /____/  \\____/`-._> /               \\ <_.-`\\____/  \\____\\\n" +
                "  /____/    /__/      /-._     .   _.-  \\      \\__\\    \\____\\\n" +
                " /____/    /__/      /         .         \\      \\__\\    \\____\\\n" +
                "|____/_  _/__/      /          .          \\      \\__\\_  _\\____|\n" +
                " \\__/_ ``_|_/      /      -._  .        _.-\\      \\_|_`` _\\___/\n" +
                "   /__`-`__\\      <_         `-;        NDT_>      /__`-`__\\\n" +
                "      `-`           `-._       ;       _.-`           `-`\n" +
                "                        `-._   ;   _.-`\n" +
                "                            `-._.-` ");


    }

}
