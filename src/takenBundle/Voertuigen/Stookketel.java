package takenBundle.Voertuigen;

public class Stookketel implements Vervuiler {
    private float CONorm;
    public Stookketel(float CONorm){
        setCONorm(CONorm);
    }

    public float getCONorm() {
        return CONorm;
    }

    public void setCONorm(float CONorm) {
        this.CONorm = CONorm;
    }

    @Override
    public double berekenVervuiling() {
        return getCONorm()*100;
    }
}
