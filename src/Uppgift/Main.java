package Uppgift;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    Main() {
        Kaktus Igge = new Kaktus("Igge",0.2,"Kaktus");
        Palm Laura = new Palm("Laura",5,"Palm");
        KöttätandeVäxt Meatloaf = new KöttätandeVäxt("Meatloaf",0.7,"Köttätande växt");
        Palm Putte = new Palm("Putte",1,"Palm");

        //skapar en arrayList som sparar alla växter
        List<Växter> list = new ArrayList<>();
        list.add(Igge);
        list.add(Laura);
        list.add(Meatloaf);
        list.add(Putte);

        //sparar arrayListen i valen som användaren kan välja mellan
        Växter[] options = list.toArray(Växter[]::new);

        //castar JOptionPanes till Växter så att jag kan få ut alla metoder i växter
        Växter input = (Växter) JOptionPane.showInputDialog(null, "Which plant do you want to water?",
                "Choose a plant", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        //ser till så att det inte blir ett error meddelande om man klickar cancel eller på krysset
        if (input == null) {
            System.exit(0);
        }

        //loopar igenom alla växter o skriver ut den som stämmer överens med vad användaren valde
        for (int i = 0; i < options.length; i++) {
            if(input.equals(options[i])) {
                JOptionPane.showMessageDialog(null, options[i].printMe());
            }
        }

    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
