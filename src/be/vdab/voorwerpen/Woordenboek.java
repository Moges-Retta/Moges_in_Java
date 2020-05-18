package be.vdab.voorwerpen;

import be.vdab.util.Voorwerp;
import be.vdab.voorwerpen.Boek;

public class Woordenboek extends Boek implements Voorwerp {
    private String taal;
    private float winstmarge = 1.75F;
    public Woordenboek(){
        this("Woorden Boek","Van Dale","VDAB",280.5F,"Taal","NL",25.5F);
    }
    public Woordenboek(String title,String auteur,String eigenaar,float aankoopprijs,String genre,String taal,
        float winstmarge){
        super( title, auteur, eigenaar, aankoopprijs, genre);
        setWinstmarge(winstmarge);
        setTaal(taal);
    }

    public String getTaal() {
            return taal;
    }

    public void setTaal(String taal) {
        if(taal!=null&&!taal.isEmpty())
            this.taal = taal;
    }

    public float getWinstmarge() {
        return winstmarge;
    }

    public void setWinstmarge(float winstmarge) {
        this.winstmarge = winstmarge;
    }

    @Override
    public String toString() {
        return getWinstmarge()+";"+getTaal();
    }

    @Override
    public void gegevensTonen() {
        System.out.println(getTaal()+";" + getWinstmarge());
    }

    @Override
    public float winstBerekenen() {
        return getAankoopprijs()*getWinstmarge();
    }
}
