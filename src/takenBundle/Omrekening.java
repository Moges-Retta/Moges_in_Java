package takenBundle;

import java.util.Scanner;

public class Omrekening {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Geef getal");
        int seconden = scanner.nextInt();
        int u = seconden/3600;
        int m = (seconden - u*3600)/60;
        int s = (seconden - u*3600-m*60);
        System.out.print("u:"+ u+" ");
        System.out.print("M:"+ m+" ");
        System.out.print("S:"+ s+" ");
    }
}
