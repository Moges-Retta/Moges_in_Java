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
        var vervuilers = new Vervuiler[4];
        vervuilers[0] =  new Vrachtwagen();
        vervuilers[1] = new Vrachtwagen(3,5,"moges",2000F,20,2,"TEB688");
        vervuilers[2] = new Personenwagen(3);
        vervuilers[3] = new Personenwagen(3,5,"moges",200F,20,2,"TEB688");
        for(var vervuiler:vervuilers){
            System.out.println(vervuiler);
            System.out.println("De vervuiling van " + (vervuiler instanceof Vrachtwagen?"Personswagen":"Vrachwaagen")+
                    vervuiler.berekenVervuiling());
        }

        var privaats = new Privaat[4];
        privaats[0] =  new Vrachtwagen();
        privaats[1] = new Vrachtwagen(3,5,"moges",2000F,20,2,"TEB688");
        privaats[2] = new Personenwagen(3);
        privaats[3] = new Personenwagen(3,5,"moges",200F,20,2,"TEB688");
        for(var privaat:privaats){
            privaat.geefPrivateData();
        }

        var Milleus = new Milleu[4];
        Milleus[0] =  new Vrachtwagen();
        Milleus[1] = new Vrachtwagen(3,5,"moges",2000F,20,2,"TEB688");
        Milleus[2] = new Personenwagen(3);
        Milleus[3] = new Personenwagen(3,5,"moges",200F,20,2,"TEB688");
        for(var Milleu:Milleus){
            Milleu.geefMilieuData();
        }
    }
}
