package takenBundle.Voertuigen;

public abstract class Voertuig implements Privaat,Milleu{
    private String polishouder;
    private float kostprijs;
    private int pk;
    private float gegmVerbruik;
    private String nummerplaat;

    public Voertuig(){
    }
    public Voertuig(String polishouder, float kostprijs, int pk, float gegmVerbruik,String nummerplaat){
        setPolishouder(polishouder);
        setKostprijs(kostprijs);
        setPk(pk);
        setGegmVerbruik(gegmVerbruik);
        setNummerplaat(nummerplaat);
    }

    public String getPolishouder() {
        return polishouder;
    }

    public void setPolishouder(String polishouder) {
        if(polishouder != null && !polishouder.isEmpty() ) {
            this.polishouder = polishouder;
        }
    }

    public float getKostprijs() {
        return kostprijs;
    }

    public void setKostprijs(float kostprijs) {
        if(kostprijs>0) {
            this.kostprijs = kostprijs;
        }
    }

    public int getPk() {
        return pk;
    }

    public final void setPk(int pk) {
        if(pk>0) {
            this.pk = pk;
        }
    }

    public float getGegmVerbruik() {
        return gegmVerbruik;
    }

    public final void setGegmVerbruik(float gegmVerbruik) {
        this.gegmVerbruik = gegmVerbruik;
    }

    public String getNummerplaat() {
            return nummerplaat;
    }

    public final void setNummerplaat(String nummerplaat) {
        if(nummerplaat != null && !nummerplaat.isEmpty()) {
            this.nummerplaat = nummerplaat;
        }
    }
    @Override
    public String toString() {
        return polishouder + ", " + kostprijs+ ", " +pk+ ", " +gegmVerbruik+ ", "+nummerplaat ;
    }
    public void toon(){
        System.out.println("De polishouder :" + getPolishouder() + "\n De kostprijs : "+getKostprijs()+ "\n De pk: "+getPk()+ "\n De " +
                "gegmVerbruik " +getGegmVerbruik()+"\n De nummerplaat: "+getNummerplaat());
    }
    public abstract double getKyotoScore();

    @Override
    public void geefPrivateData() {
        System.out.println(getPolishouder()+";" +getNummerplaat());
    }

    @Override
    public void geefMilieuData() {
        System.out.println(getPk() +";" + getKostprijs() +";"+ getGegmVerbruik());
    }
}
