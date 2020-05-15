package takenBundle.Voorwerpen;

public class Leesboek extends Boek implements Voorwerp{
    private String onderwerp;
    private float winstmarge = 1.5F;

    public Leesboek(){
        this("Lees Boek","Mark","VDAB",100F,"Romans","murder",25F);
    }
    public Leesboek(String title,String auteur,String eigenaar,float aankoopprijs,String genre,String onderwerp,
                    float winstmarge){
        super(title, auteur, eigenaar, aankoopprijs, genre);
        setWinstmarge(winstmarge);
        setOnderwerp(onderwerp);
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    public void setOnderwerp(String onderwerp) {
        if(onderwerp!=null&&!onderwerp.isEmpty())
            this.onderwerp = onderwerp;
    }

    public float getWinstmarge() {
        return winstmarge;
    }

    public void setWinstmarge(float winstmarge) {
            this.winstmarge = winstmarge;
    }
    @Override
    public String toString() {
        return onderwerp+";"+ winstmarge;
    }

    @Override
    public void gegevensTonen() {
        System.out.println(getOnderwerp() + ";" + getWinstmarge());
    }

    @Override
    public float winstBerekenen() {
        return  getAankoopprijs()*getWinstmarge();
    }
}
