package be.vdab.jpfhfdst7;

public class BankBediende {
    public static void main(String[] args) {
        System.out.println("Intrestpercentage van de spaarrekening: " + Spaarrekening.getIntrest());
        var spaar = new Spaarrekening("BE12 3456 7890 1234", 1.5);
        var zicht = new Zichtrekening("BE98 7654 3210 9876", 1000);
        System.out.println("Intrestpercentage van de spaarrekening: " + Spaarrekening.getIntrest());
        System.out.println("MaxKrediet van de zichtrekening is: " + zicht.getMaxKrediet());
        spaar.storten(600.0);
        zicht.storten(200.0);
        spaar.afhalen(25.0);
        System.out.println("Saldo van de spaarrekening: " + spaar.getSaldo());
        zicht.afhalen(50.0);
        System.out.println("Saldo van de zichtrekening: " + zicht.getSaldo());
        zicht.afhalen(2000);
        System.out.println("Saldo van de zichtrekening (na poging " + "afhalen 2000): " + zicht.getSaldo());
        spaar.afhalen(600.0);
        System.out.println("Saldo van de spaarrekening (na poging " + "afhalen 600): " + spaar.getSaldo());
        zicht.afhalen(1100);
        System.out.println( "Saldo van de zichtrekening (na poging " + "afhalen 1100): " + zicht.getSaldo());
        zicht.setMaxKrediet(2000);
        System.out.println( "MaxKrediet van de zichtrekening is: " + zicht.getMaxKrediet() );
        zicht.afhalen(900);
        System.out.println( "Saldo van de zichtrekening (na poging " + "afhalen 900): " + zicht.getSaldo());
    }
}
