package takenBundle;

import java.util.Scanner;

public class Rekenaar {
    public static void main(String[] args) {

        var rek = new ReknaarClass();
        rek.setTekst("17 + 38 * 2 - 22");
        System.out.println(rek);
        System.out.println("De totaal : " + rek.getTotaal());

        rek.setTekst("");
        System.out.println(rek);
        System.out.println("De totaal : " + rek.getTotaal());

        rek.setTekst("1 - 3 - 2 + 1");
        System.out.println(rek);
        System.out.println("De totaal : " + rek.getTotaal());

        System.out.println("Geef expressie (bv.17 + 38 * 2 – 22)");
        Scanner keyboard = new Scanner(System.in);
        rek.setTekst(keyboard.nextLine());
        System.out.println(rek);
        System.out.println("De totaal : " + rek.getTotaal());
        }
}

