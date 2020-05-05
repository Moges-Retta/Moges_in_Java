package takenBundle;

import java.util.Scanner;

public class WaarnemerMain {
    public static void main(String[] args) {
        var thermometer = new Waarnemer();
        var scanner = new Scanner(System.in) ;
        System.out.println("Geef een temperatuur in (stop = 999):");
        var temperatuur = scanner.nextInt();
        while (temperatuur != 999) {
            thermometer.registreer(temperatuur);
            System.out.println("Geef een temperatuur in:");
            temperatuur = scanner.nextInt();
        }
        System.out.println("Het aantal waarnemingen is: " +
                thermometer.getAantalWaarnemingen());
        System.out.println("De hoogste temperatuur is: " +
                thermometer.getMaxTemp());
        System.out.println("De laagste temperatuur is: " +
                thermometer.getMinTemp());
        System.out.println("De gemiddelde temperatuur is: " +
                thermometer.getGemTemp());
    }
}
/**public class WaarnemerMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("geef temperature of 999 om te stopen");
        float temp  = keyboard.nextFloat();
        var temperatuur = new float[2];
        var count = 0;
        while((int)temp!= 999){
            temperatuur[count] = temp;
            count++;
            System.out.println("geef temperature of 999 om te stopen");
            temp  = keyboard.nextFloat();
        }
            System.out.println(Waarnemer.aantal(temperatuur));
            System.out.println(Waarnemer.minTemperatuur(temperatuur));
            System.out.println(Waarnemer.maxTemperatuur(temperatuur));
            System.out.println(Waarnemer.gemiddelde(temperatuur));
    }
}*/