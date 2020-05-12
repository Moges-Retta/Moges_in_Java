package takenBundle;

import java.util.Scanner;

public class Klinkers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef een zin");
        var tekst = keyboard.nextLine();
        var teller = 0;
        for(var i=0;i!=tekst.length();i++){
            var str = tekst.substring(i,i+1);
            if (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")) {
                teller += 1;
            }
        }
        System.out.println(teller == 0 ? "Geen klinkers" : "aantal klinkers : " + teller);
    }
}
