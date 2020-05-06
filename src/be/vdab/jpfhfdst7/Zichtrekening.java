package be.vdab.jpfhfdst7;

public class Zichtrekening extends Rekening {
    private int maxKrediet;
    public Zichtrekening(String rekeningNummer, int bedrag) {
        this(rekeningNummer, 0.0, bedrag);
    }
    public Zichtrekening(String rekeningNummer, double saldo, int bedrag) {
        super(rekeningNummer, saldo);
        maxKrediet = bedrag;
    }
    public int getMaxKrediet() {
        return maxKrediet;
    }
    public void setMaxKrediet(int maxKrediet) {
        this.maxKrediet = maxKrediet;
    }
    @Override
    public void afhalen(double bedrag) {
        if (bedrag > 0.0) {
            var testSaldo = getSaldo() - bedrag + maxKrediet;
            if (testSaldo >= 0)
                super.afhalen(bedrag);
        }
    }
}
