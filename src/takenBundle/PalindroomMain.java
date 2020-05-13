package takenBundle;

import java.util.Scanner;

public class PalindroomMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("geef woordje");
        var tekst  = keyboard.next();
        var woordje = new Palindroom(tekst.toLowerCase());
        System.out.println(woordje);
        System.out.println(woordje.getTekst() + " palindroom? " + woordje.isPalindroom());
        woordje.setTekst("kok".toLowerCase());
        System.out.println(woordje);
        System.out.println(woordje.getTekst() + " palindroom? " + woordje.isPalindroom());
    }
}
