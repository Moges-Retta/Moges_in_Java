package takenBundle.Voertuigen;

public class Vrachtwagen extends Voertuig implements Vervuiler{
    private float maxLading = 10_000F;
    public Vrachtwagen(){
        setMaxLading(maxLading);
    }
    public Vrachtwagen(float maxLading){
        setMaxLading(maxLading);
    }
    public Vrachtwagen(int aantalDeuren, int aantalPassagiers,String polishouder,float kostprijs,int pk,
                          float gegmVerbruik,String nummerplaat){
        super(polishouder, kostprijs,pk,gegmVerbruik,nummerplaat);
        setMaxLading(maxLading);
    }
    public float getMaxLading() {
        return maxLading;
    }

    public void setMaxLading(float maxLading) {
        if(maxLading>0.0) {
            this.maxLading = maxLading;
        }
    }
    @Override
    public String toString() {
        return ""+ maxLading;
    }
    @Override
    public void toon(){
        super.toon();
        System.out.println("De max lading :" + getMaxLading() );
    }
    @Override
    public double getKyotoScore(){
        return getGegmVerbruik()*getPk()/getMaxLading()/1000.0F;
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore()*20;
    }
}
