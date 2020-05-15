package takenBundle.Voorwerpen;

public class Boekenrek implements Voorwerp{
    private String eigenaar = "VDAB";
    private int hoogte;
    private int breedte;
    private float aankoopprijs;
    private float winstmarge = 2.0F;

    public Boekenrek(){

    }
    public Boekenrek(String eigenaar,int hoogte,int breedte,int aankoopprijs,int winstmarge){
    setEigenaar(eigenaar);
    setHoogte(hoogte);
    setBreedte(breedte);
    setAankoopprijs(aankoopprijs);
    setWinstmarge(winstmarge);
    }

    public String getEigenaar() {
        return eigenaar;
    }

    public void setEigenaar(String eigenaar) {
        if(eigenaar!=null&&!eigenaar.isEmpty())
            this.eigenaar = eigenaar;
    }

    public int getHoogte() {
        return hoogte;
    }

    public void setHoogte(int hoogte) {
        if(hoogte>0)
            this.hoogte = hoogte;
    }

    public int getBreedte() {
        return breedte;
    }

    public void setBreedte(int breedte) {
        if(breedte>0)
            this.breedte = breedte;
    }

    public float getAankoopprijs() {
        return aankoopprijs;
    }

    public void setAankoopprijs(float aankoopprijs) {
        if(aankoopprijs>0F)
            this.aankoopprijs = aankoopprijs;
    }

    public float getWinstmarge() {
        return winstmarge;
    }

    public void setWinstmarge(float winstmarge) {
        if(winstmarge>0F)
            this.winstmarge = winstmarge;
    }
    public float winst(){
        return getAankoopprijs()*getWinstmarge();
    }

    @Override
    public String toString() {
        return getWinstmarge()+";"+getAankoopprijs()+";"+getHoogte()+";"+getBreedte()+";"+getEigenaar();
    }

    @Override
    public void gegevensTonen() {
        System.out.println(getWinstmarge()+";"+getAankoopprijs()+";"+getHoogte()+";"+getBreedte()+";"+getEigenaar());
    }

    @Override
    public float winstBerekenen() {
        return getAankoopprijs()*getWinstmarge();
    }
}
