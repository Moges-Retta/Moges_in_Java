package takenBundle.Voertuigen;

public class Personenwagen extends Voertuig{
    private int aantalDeuren = 4;
    private int aantalPassagiers = 5;
    public  Personenwagen(){
    }
    public  Personenwagen(int aantalDeuren){
        setAantalDeuren(aantalDeuren);
    }
    public  Personenwagen(int aantalDeuren, int aantalPassagiers){
        setAantalDeuren(aantalDeuren);
        setAantalPassagiers(aantalPassagiers);
    }
    public Personenwagen(int aantalDeuren, int aantalPassagiers,String polishouder,float kostprijs,int pk,
                         float gegmVerbruik,String nummerplaat){
        super(polishouder, kostprijs,pk,gegmVerbruik,nummerplaat);
        setAantalDeuren(aantalDeuren);
        setAantalPassagiers(aantalPassagiers);
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(int aantalDeuren) {
        if(aantalDeuren>0) {
            this.aantalDeuren = aantalDeuren;
        }
    }

    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    public void setAantalPassagiers(int aantalPassagiers) {
        if(aantalPassagiers>0) {
            this.aantalPassagiers = aantalPassagiers;
        }
    }
    @Override
    public String toString() {
        return aantalPassagiers+","+ aantalDeuren;
    }
    @Override
    public void toon(){
        super.toon();
        System.out.println("De aantalDeuren :" + getAantalDeuren() + "\r\n"+" De aantalPassagiers :"
                + getAantalPassagiers());
    }
    @Override
    public double getKyotoScore(){
        return getGegmVerbruik()*getPk()/getAantalPassagiers();
    }
}
