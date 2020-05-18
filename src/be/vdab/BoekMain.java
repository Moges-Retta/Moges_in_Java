package be.vdab;

import be.vdab.util.Voorwerp;
import be.vdab.voorwerpen.Boekenrek;
import be.vdab.voorwerpen.Leesboek;
import be.vdab.voorwerpen.Woordenboek;

public class BoekMain {
    public static void main(String[] args) {
        // default constructor
        var Voorwerpen = new Voorwerp[6];
        Voorwerpen[0] = new Boekenrek();
        Voorwerpen[1] = new Boekenrek("VDAB",75,90,100,28 );
        Voorwerpen[2] = new Woordenboek();
        Voorwerpen[3] = new Woordenboek("Woorden Boek","Van Dale","VDAB",280.5F,"Taal","NL",20.75F);
        Voorwerpen[4] = new Leesboek();
        Voorwerpen[5] = new Leesboek("Lees Boek","Mark","VDAB",100F,"Romans","murder",30.5F);

        float totalWinst = 0;
        for(var voorwerp:Voorwerpen){
            if(voorwerp instanceof Boekenrek)
                System.out.println("Boekenrek");
            if(voorwerp instanceof Woordenboek)
                System.out.println("Woordenboek");
            if(voorwerp instanceof Leesboek)
                System.out.println("Leesboek");
            voorwerp.gegevensTonen();
            totalWinst+=voorwerp.winstBerekenen();
        }
        System.out.println(totalWinst);
    }
}
