package takenBundle;

public class KaarMain {
    public static void main(String[] args) {
        var kaart1 = new Kaart();
        var kaart2 = new Kaart();
        kaart1.printKaart(kaart1);
        kaart1.printKaart(kaart2);
        System.out.println("Kaar1 is hooger?"+ Kaart.isHooger(kaart1,kaart2));
    }
}
