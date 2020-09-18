import java.util.Scanner;


class CYOAdventure {

    static Scanner input = new Scanner(System.in);

    static String line1 = "The girl is angry. The broom handle whips out of your hands and lodges itself down your throat. You suffocate."; //check
    static String line2 = "You ram the door, bruising your shoulder, but you’re in! You want a weapon, but there’s not much around. Do you choose: \n1. A dusty broom handle\n2. A creepy doll";
    static String line3 = "You hear a laugh from inside a room. Do you:\n1. Follow it\n2. Run away";
    static String line4 = "Despite Rufus pulling towards the house, you return home. That night, he goes missing. Do you:\n1. Go looking for him at the house\n2. Hope he comes home";
    static String line5 = "You run home, covered in Rufus’ blood. You’re alive, but at what cost? You dream of your dog every night until you can’t take it anymore, committing suicide 2 years on.";
    static String line6 = "Rufus suddenly turns insane and starts attacking you. Do you:\n1. Stab him with the dagger\n2. Run";
    static String line7 = "The door is locked! Do you:\n1. Break a window\n2. Shoulder-barge the door";
    static String line8 = "As you turn to leave, Rufus slips away. You chase him around the side of the house and find an open cellar door, with steps leading down. Do you:\n1. Enter\n2. grab him and leave for medical attention";
    static String line9 = "The doll starts to speak. Do you:\n1. Try to figure out what she’s saying\n2. Throw her on the floor in fear";
    static String line10 = "Rufus pulls towards the door of the house. Looks like you’re going in!";
    static String line11 = "The doll is asking you to go into a different room. Do you:\n1. Agree, and go? \n2. Refuse, and smash her on the floor";
    static String line12 = "Feeling scared, you want a weapon. Do you choose:\n1. A dusty broom handle \n2. A ceremonial dagger";
    static String line13 = "Rufus is faster than you. He manages to catch your jugular. You bleed out, and die.";
    static String line14 = "You get halfway down the driveway before you pass out from blood loss, dying before you’re found.";
    static String line15 = "There are no rocks nearby, so you wrap your arm in your sweater and punch the window. It breaks, but you’ve cut yourself. Do you:\n1. Leave and get medical attention\n2. Continue anyway";
    static String line16 = "A young girl appears. Do you:\n1. Try to befriend her \n2. Hit her with the broom handle";
    static String line17 = "Rufus attacks you in your sleep. Your jugular bitten, you bleed out and die.";
    static String line18 = "The young girl tries to take your hand and lead you away. Do you:\n1. Go with her\n2. Refuse and stay where you are";
    static String line19 = "After waiting 3 days, Rufus returns. But he doesn’t seem himself. Do you: \n1. Ignore it, happy he’s back \n2. Take him to the house to try and figure out why";
    static String line20 = "Ghosts appear. You fall to the floor and cannot move. Eventually, you die of dehydration, surrounded only by apparitions.";




static void startAdventure(){

    System.out.println("You’re walking your dog, Rufus, and see an abandoned house. Do you:\n1. Explore\n2. Walk away\n3. Let Rufus decide");

    int count = input.nextInt();

    switch(count) {
        case 1:
            System.out.println(line7);
            count = input.nextInt();

            switch(count){
                case 1:
                    System.out.println(line15);
                    count = input.nextInt();

                    switch(count){

                        case 1:
                            System.out.println(line8);
                            count = input.nextInt();

                            switch (count){

                                case 1:
                                    System.out.println(line16);
                                    count = input.nextInt();

                                    switch (count){

                                        case 1:
                                            System.out.println(line18);
                                            count = input.nextInt();

                                            switch (count){

                                                case 1:
                                                    System.out.println(line20);
                                                    break;
                                                    //slut

                                                case 2:
                                                    System.out.println(line1);
                                                    break;
                                                    //slut

                                            }

                                        case 2:
                                            System.out.println(line1);
                                            break;
                                            //slut

                                    }

                                case 2:
                                    System.out.println(line14);
                                    break;
                                    //slut

                            }

                        case 2:
                            System.out.println(line12);
                            count = input.nextInt();

                            switch (count){

                                case 1:
                                    System.out.println(line3);
                                    count = input.nextInt();

                                    switch (count){

                                        case 1:
                                            System.out.println(line16);
                                            count = input.nextInt();

                                            switch (count){

                                                case 1:
                                                    System.out.println(line18);

                                                    count = input.nextInt();
                                                    switch(count){

                                                        case 1:
                                                            System.out.println(line20);
                                                            break;
                                                            //slut
                                                        case 2:
                                                            System.out.println(line1);
                                                            break;
                                                            //slut

                                                    }

                                                case 2:
                                                    System.out.println(line1);
                                                    break;
                                                    //slut

                                            }

                                        case 2:
                                            System.out.println(line14);
                                            break;
                                            //slut

                                    }


                                case 2:
                                    System.out.println(line6);
                                    count = input.nextInt();

                                    switch (count){

                                        case 1:
                                            System.out.println(line5);
                                            break;
                                            //slut

                                        case 2:
                                            System.out.println(line13);
                                            break;
                                            //slut

                                    }

                            }

                    }

                case 2:
                    System.out.println(line2);
                    count = input.nextInt();

                    switch(count){

                        case 1:
                            System.out.println(line16);
                            count = input.nextInt();

                            switch (count){

                                case 1:
                                    System.out.println(line18);
                                    count = input.nextInt();

                                    switch (count){

                                        case 1:
                                            System.out.println(line20);
                                            break;
                                            //slut
                                        case 2:
                                            System.out.println(line1);
                                            break;
                                            //slut

                                    }

                                case 2:
                                    System.out.println(line1);
                                    break;
                                    //slut

                            }

                        case 2:
                            System.out.println(line9);
                            count = input.nextInt();

                            switch (count){

                                case 1:
                                    System.out.println(line11);
                                    count = input.nextInt();

                                    switch (count){

                                        case 1:
                                            System.out.println(line16);
                                            count = input.nextInt();

                                            switch (count){

                                                case 1:
                                                    System.out.println(line18);
                                                    count = input.nextInt();
                                                    switch (count){

                                                        case 1:
                                                            System.out.println(line20);
                                                            break;
                                                            //slut
                                                        case 2:
                                                            System.out.println(line1);
                                                            break;
                                                            //slut

                                                    }

                                                case 2:
                                                    System.out.println(line1);
                                                    break;
                                                    // slut

                                            }

                                        case 2:
                                            System.out.println(line20);
                                            break;
                                            //slut
                                    }

                                    case 2:
                                        System.out.println(line20);
                                        break;
                                        //slut

                            }

                    }
            }

        case 2:
            System.out.println(line4);
            count = input.nextInt();

            switch(count){
                case 1:
                    System.out.println(line7);
                    count = input.nextInt();
                    switch (count){

                        case 1:
                            System.out.println(line15);  /////
                            count = input.nextInt();

                            switch (count){

                                case 1:
                                    System.out.println(line8);
                                    count = input.nextInt();

                                    switch (count){

                                        case 1:
                                            System.out.println(line16);
                                            count = input.nextInt();

                                            switch (count){

                                                case 1:
                                                    System.out.println(line18);
                                                    count = input.nextInt();

                                                    switch (count){

                                                        case 1:
                                                            System.out.println(line20);
                                                            break;
                                                            // slut

                                                        case 2:
                                                            System.out.println(line1);
                                                            break;
                                                            // slut

                                                    }

                                                case 2:
                                                    System.out.println(line1);
                                                    break;
                                                    // slut
                                            }

                                        case 2:
                                            System.out.println(line14);
                                            break;
                                            //slut

                                    }

                                case 2:
                                    System.out.println(line12);
                                    count = input.nextInt();
                                    switch (count){

                                        case 1:
                                            System.out.println(line3);
                                            count = input.nextInt();

                                            switch(count){

                                                case 1:
                                                    System.out.println(line16);
                                                    count = input.nextInt();

                                                    switch (count){

                                                        case 1:
                                                            System.out.println(line18);
                                                            count = input.nextInt();

                                                            switch (count){

                                                                case 1:
                                                                    System.out.println(line20);
                                                                    break;
                                                                    //slut

                                                                case 2:
                                                                    System.out.println(line1);
                                                                    break;
                                                                    //slut

                                                            }

                                                        case 2:
                                                            System.out.println(line1);
                                                            break;
                                                            // slut

                                                    }

                                                case 2:
                                                    System.out.println(line14);
                                                    break;
                                                    // slut

                                            }

                                        case 2:
                                            System.out.println(line6);
                                            count = input.nextInt();

                                            switch (count){

                                                case 1:
                                                    System.out.println(line5);
                                                    break;
                                                    //slut

                                                case 2:
                                                    System.out.println(line13);
                                                    break;
                                                    //slut

                                            }

                                    }

                            }

                        case 2:
                            System.out.println(line2);
                            count = input.nextInt();

                            switch (count){

                                case 1:
                                    System.out.println(line16);
                                    count = input.nextInt();
                                    switch (count){

                                        case 1:
                                            System.out.println(line18);
                                            count = input.nextInt();

                                            switch (count) {

                                                case 1:
                                                    System.out.println(line20);
                                                    break;
                                                    //slut

                                                case 2:
                                                    System.out.println(line1);
                                                    break;
                                                    //slut

                                            }

                                        case 2:
                                            System.out.println(line1);
                                            break;
                                            //slut

                                    }

                                case 2:
                                    System.out.println(line9);
                                    count = input.nextInt();
                                    switch (count){

                                        case 1:
                                            System.out.println(line11);
                                            count = input.nextInt();

                                            switch (count){

                                                case 1:
                                                    System.out.println(line16);
                                                    count = input.nextInt();
                                                    switch (count){

                                                        case 1:
                                                            System.out.println(line18);
                                                            count = input.nextInt();
                                                            switch (count){

                                                                case 1:
                                                                    System.out.println(line20);
                                                                    break;
                                                                    //slut
                                                                case 2:
                                                                    System.out.println(line1);
                                                                    break;
                                                                    //slut

                                                            }

                                                        case 2:
                                                            System.out.println(line1);
                                                            break;
                                                            //slut

                                                    }

                                                case 2:
                                                    System.out.println(line20);
                                                    break;
                                                    //slut

                                            }

                                        case 2:
                                            System.out.println(line20);
                                            break;
                                            //slut

                                    }

                            }

                    }

                case 2:
                    System.out.println(line19);
                    count = input.nextInt();
                    switch (count){

                        case 1:
                            System.out.println(line17);
                            break;
                            // slut
                        case 2:
                            System.out.println(line7);
                            count = input.nextInt();

                            switch (count){
                                case 1:
                                    System.out.println(line15);
                                    count = input.nextInt();
                                    switch (count){

                                        case 1:
                                            System.out.println(line8);
                                            count = input.nextInt();

                                            switch (count){

                                                case 1:
                                                    System.out.println(line16);
                                                    count = input.nextInt();

                                                    switch (count){

                                                        case 1:
                                                            System.out.println(line18);
                                                            count = input.nextInt();
                                                            switch (count){

                                                                case 1:
                                                                    System.out.println(line20);
                                                                    break;
                                                                    //slut
                                                                case 2:
                                                                    System.out.println(line1);
                                                                    break;
                                                                    //slut

                                                            }

                                                        case 2:
                                                            System.out.println(line1);
                                                            break;
                                                            //slut

                                                    }
                                                case 2:
                                                    System.out.println(line14);
                                                    break;
                                                    //slut

                                            }

                                        case 2:
                                            System.out.println(line12);
                                            count = input.nextInt();
                                            switch (count){

                                                case 1:
                                                    System.out.println(line3);
                                                    count = input.nextInt();
                                                    switch (count){

                                                        case 1:
                                                            System.out.println(line16);
                                                            count = input.nextInt();

                                                            switch (count){

                                                                case 1:
                                                                    System.out.println(line18);
                                                                    count = input.nextInt();
                                                                    switch (count){

                                                                        case 1:
                                                                            System.out.println(line20);
                                                                            break;
                                                                            //slut
                                                                        case 2:
                                                                            System.out.println(line1);
                                                                            break;
                                                                            //slut

                                                                    }

                                                                case 2:
                                                                    System.out.println(line1);
                                                                    break;
                                                                    //slut

                                                            }

                                                        case 2:
                                                            System.out.println(line14);
                                                            break;
                                                            //slut

                                                    }

                                                case 2:
                                                    System.out.println(line6);
                                                    count = input.nextInt();

                                                    switch (count){

                                                        case 1:
                                                            System.out.println(line5);
                                                            break;
                                                            //slut
                                                        case 2:
                                                            System.out.println(line13);
                                                            break;
                                                            //slut

                                                    }

                                            }

                                    }
                                case 2:
                                    System.out.println(line2);
                                    count = input.nextInt();

                                    switch (count){

                                        case 1:
                                            System.out.println(line16);
                                            count = input.nextInt();

                                            switch (count){

                                                case 1:
                                                    System.out.println(line18);
                                                    count = input.nextInt();
                                                    switch (count){

                                                        case 1:
                                                            System.out.println(line20);
                                                            break;
                                                            //slut
                                                        case 2:
                                                            System.out.println(line1);
                                                            break;
                                                            //slut

                                                    }
                                                case 2:
                                                    System.out.println(line1);
                                                    break;
                                                    //slut

                                            }
                                        case 2:
                                            System.out.println(line9);
                                            count = input.nextInt();
                                            switch (count){

                                                case 1:
                                                    System.out.println(line11);
                                                    count = input.nextInt();

                                                    switch (count){

                                                        case 1:
                                                            System.out.println(line16);
                                                            count = input.nextInt();

                                                            switch (count){

                                                                case 1:
                                                                    System.out.println(line18);
                                                                    count = input.nextInt();

                                                                    switch (count){

                                                                        case 1:
                                                                            System.out.println(line20);
                                                                            break;
                                                                            //slut
                                                                        case 2:
                                                                            System.out.println(line1);
                                                                            break;
                                                                            //slut

                                                                    }

                                                                case 2:
                                                                    System.out.println(line1);
                                                                    break;
                                                                    //slut

                                                            }

                                                        case 2:
                                                            System.out.println(line20);
                                                            break;
                                                            //slut

                                                    }

                                                case 2:
                                                    System.out.println(line20);
                                                    break;
                                                    //slut

                                            }

                                    }

                            }

                    }
            }

        case 3:
            System.out.println(line10);
            System.out.println(line7);
            count = input.nextInt();

            switch (count){

                case 1:
                    System.out.println(line15);
                    count = input.nextInt();
                    switch (count){

                        case 1:
                            System.out.println(line8);
                            count = input.nextInt();
                            switch (count) {

                                case 1:
                                    System.out.println(line16);
                                    count = input.nextInt();
                                    switch (count) {

                                        case 1:
                                            System.out.println(line18);
                                            count = input.nextInt();
                                            switch (count) {

                                                case 1:
                                                    System.out.println(line20);
                                                    break;
                                                //slut
                                                case 2:
                                                    System.out.println(line1);
                                                    break;
                                                //slut

                                            }

                                        case 2:
                                            System.out.println(line1);
                                            break;
                                        //slut
                                    }
                                            ///////////////////////////////////////////////////////////////////////////////

                                case 2:
                                    System.out.println(line14);
                                    break;
                                    //slut

                            }

                                case 2:
                                    System.out.println(line12);
                                    count = input.nextInt();

                                    switch (count){

                                        case 1:
                                            System.out.println(line3);
                                            count = input.nextInt();

                                            switch (count){

                                                case 1:
                                                    System.out.println(line16);
                                                    count = input.nextInt();
                                                    switch (count){

                                                        case 1:
                                                            System.out.println(line18);
                                                            count = input.nextInt();
                                                            switch (count){

                                                                case 1:
                                                                    System.out.println(line20);
                                                                    break;
                                                                    //slut
                                                                case 2:
                                                                    System.out.println(line1);
                                                                    break;
                                                                    //slut

                                                            }

                                                        case 2:
                                                            System.out.println(line1);
                                                            break;
                                                            //slut
                                                    }

                                                case 2:
                                                    System.out.println(line14);
                                                    break;
                                                    //slut

                                            }

                                        case 2:
                                            System.out.println(line6);
                                            count = input.nextInt();

                                            switch (count){

                                                case 1:
                                                    System.out.println(line5);
                                                    break;
                                                    //slut
                                                case 2:
                                                    System.out.println(line13);
                                                    break;
                                                    //slut

                                            }

                                    }

                            }
                        case 2:
                            System.out.println(line2);
                            count = input.nextInt();

                            switch (count){

                                case 1:
                                    System.out.println(line16);
                                    count = input.nextInt();

                                    switch (count){

                                        case 1:
                                            System.out.println(line18);
                                            count = input.nextInt();

                                            switch (count){

                                                case 1:
                                                    System.out.println(line20);
                                                    break;
                                                case 2:
                                                    System.out.println(line1);
                                                    break;

                                            }

                                        case 2:
                                            System.out.println(line1);
                                            break;
                                            //slut

                                    }

                                case 2:
                                    System.out.println(line9);
                                    count = input.nextInt();

                                    switch (count){

                                        case 1:
                                            System.out.println(line11);
                                            count = input.nextInt();

                                            switch (count){

                                                case 1:
                                                    System.out.println(line16);
                                                    count = input.nextInt();

                                                    switch (count) {

                                                        case 1:
                                                            System.out.println(line18);
                                                            count = input.nextInt();

                                                            switch (count){

                                                                case 1:
                                                                    System.out.println(line20);
                                                                    break;
                                                                case 2:
                                                                    System.out.println(line1);
                                                                    break;

                                                            }

                                                        case 2:
                                                            System.out.println(line20);
                                                            break;

                                                    }

                                                case 2:
                                                    System.out.println(line20);
                                                    break;

                                            }

                                        case 2:
                                            System.out.println(line20);
                                            break;
                                            // slut

                                    }

                            }

                    }


    }




}




    public static void main(String[] args) {

    startAdventure();

    }

}
