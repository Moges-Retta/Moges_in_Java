package vdab.be.jpfhfdst10;

public class KostProgramma {
    public static void main(String[] args) {
            var kosten = new Kost[4];
            kosten[0] = new Werknemer("Eddy", 2000.0);
            kosten[1] = new Werknemer("Elly", 2500.0);
            kosten[2] = new Vrachtwagen("DAF", 0.35, 25000, 150000.0, 8);
            kosten[3] = new Kopieermachine("Konica", 0.02, 9000);
            var personeelsKosten = 0.0;
            var andereKosten = 0.0;
            for (var eenKost : kosten) {
                if (eenKost.personeelsKost())
                    personeelsKosten += eenKost.bedragKost();
                else
                    andereKosten += eenKost.bedragKost();
            }
            System.out.println("Personeelskosten :" + personeelsKosten);
            System.out.println("Andere kosten : " + andereKosten);
        }
        /**var eddy = new Werknemer("Eddy", 2000.0);
        var elly = new Werknemer("Elly", 2500.0);
        var daf = new Vrachtwagen("DAF", 0.35, 25000, 150000.0, 8);
        var konica = new Kopieermachine("Konica", 0.02, 9000);
        var personeelsKosten = 0.0;
        var andereKosten = 0.0; //kosten van Eddy tellen
        if (eddy.personeelsKost())
            personeelsKosten += eddy.bedragKost();
        else
            andereKosten += eddy.bedragKost(); //kosten van Elly tellen
        if (elly.personeelsKost())
            personeelsKosten += elly.bedragKost();
        else
            andereKosten += elly.bedragKost(); //kosten van DAF tellen
        if (daf.personeelsKost())
            personeelsKosten += daf.bedragKost();
        else
            andereKosten += daf.bedragKost(); //kosten van Konica tellen
        if (konica.personeelsKost())
            personeelsKosten = personeelsKosten + konica.bedragKost();
        else
            andereKosten = andereKosten + konica.bedragKost();
        System.out.println("Personeelskosten :" + personeelsKosten);
        System.out.println("Andere kosten : " + andereKosten);

        Afschrijving.beschrijving();
    }*/
}
