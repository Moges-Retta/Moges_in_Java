package takenBundle.Voertuigen;
public class VoertuigMain {
    public static void main(String[] args) {
        /**var vrachtwagen1 = new Vrachtwagen();
        var vrachtwagen2 = new Vrachtwagen(4500);
        var personwagen1 = new Personenwagen(5);
        var personwagen2 = new Personenwagen(3,0);
        /**System.out.println("De max loading van vrachtwagen 1 :" + vrachtwagen1.toString());
        System.out.println("De max loading van vrachtwagen 2 :" + vrachtwagen2.toString());
        System.out.println(vrachtwagen1.toon());
        System.out.println(vrachtwagen2.toon());
        System.out.println("De max loading van Persoonwagen 1 :" + personwagen1.toString());
        System.out.println("De max loading van Persoonwagen 2 :" + personwagen2.toString());
        System.out.println(personwagen1.toon());
        System.out.println(personwagen2.toon());
        System.out.println("De keyoto score van vrachtwagen 1"+  vrachtwagen1.getKyotoScore());
        System.out.println("De keyoto score van vrachtwagen 2"+  vrachtwagen2.getKyotoScore());
        System.out.println("De keyoto score van Persoonwagen 1"+  personwagen1.getKyotoScore());
        System.out.println("De keyoto score van Persoonwagen 2"+  personwagen2.getKyotoScore());
*/
        // for -each lus
        var voertuigen = new Voertuig[4];
        voertuigen[0] = new Vrachtwagen();
        voertuigen[1] = new Vrachtwagen(3,5,"moges",2000F,20,2,"TEB688");
        voertuigen[2] = new Personenwagen(3);
        voertuigen[3] = new Personenwagen(3,5,"moges",200F,20,2,"TEB688");
        for(var voertuig:voertuigen){
            System.out.println(voertuig);
            voertuig.toon();
            System.out.println("De kyotoscore van " + (voertuig instanceof Vrachtwagen?"Personswagen":"Vrachwaagen")+
                     voertuig.getKyotoScore());
            }
    }
}
