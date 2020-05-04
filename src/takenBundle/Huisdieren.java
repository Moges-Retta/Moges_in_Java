package takenBundle;

import java.util.Scanner;

public class Huisdieren {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("hoeveel huisdieren heb je?");
        int aantal = keyboard.nextInt();
        switch (aantal){
            case 0:
                System.out.println("eenzaam");
                break;
            case 1:
                System.out.println("nog een?");
                break;
            case 2:
                System.out.println("goed bezig");
                break;
            case 3:
                System.out.println("lekker bezig");
                break;
            default:
                System.out.println("dieren zijn leuk");
        }
    }
}
