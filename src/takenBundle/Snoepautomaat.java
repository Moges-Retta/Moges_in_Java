
package takenBundle;

public class Snoepautomaat {
    public static void main(String[] args) {
        System.out.println("geef bedrag");
        double bedrag = 1.02*100;
        double wisselGeld = 200 - bedrag;
        int munt1 = (int) (wisselGeld/100);
        int munt2 = (int) (wisselGeld%100/50);
        int munt3 = (int) (((wisselGeld%100)%50)/20);
        int munt4 = (int) (((wisselGeld%100)%50)%20/10);
        int munt5 = (int) ((((wisselGeld%100)%50)%20)%10/5);
        int munt6 = (int) (((((wisselGeld%100)%50)%20)%10)%5/2);
        int munt7 = (int) ((((((wisselGeld%100)%50)%20)%10)%5)%2/1);

        System.out.println(munt1+"keer 1€");
        System.out.println(munt2+"keer 0.5€");
        System.out.println(munt3+"keer 0.20€");
        System.out.println(munt4+"keer 0.10€");
        System.out.println(munt5+"keer 0.05€");
        System.out.println(munt6+"keer 0.02€");
        System.out.println(munt7+"keer 0.01€");
    }
}
