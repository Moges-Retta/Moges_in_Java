package be.vdab.jpfhfdst7;

public abstract class Rekening {
    private String rekeningNummer;
    private double saldo;
    public Rekening(String rekeningNummer) {
        setRekeningNummer(rekeningNummer);
    }
    public Rekening(String rekeningNummer, double saldo) {
        setRekeningNummer(rekeningNummer);
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }
    public String getRekeningNummer() {
        return rekeningNummer;
    }
    public final void setRekeningNummer(String reknr) {
        if (reknr != null && !reknr.isEmpty() ) {
            rekeningNummer = reknr;
        }
    }
    public double getSaldo() {
        return saldo;
    }
    public void storten(double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo += bedrag;
        }
    }
    public void afhalen(double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo -= bedrag;
        }
    }
    public void overschrijven(Rekening rek, double bedrag) {
        if (checkBedrag(bedrag)) {
        saldo -= bedrag;
        rek.storten(bedrag);
         }
    }
    private boolean checkBedrag(double bedrag) {
        return bedrag > 0.0;
    }
    @Override public String toString() { return rekeningNummer + ", " + saldo; }
    public abstract double berekenIntrest();

    @Override public boolean equals(Object o) {
        if (!(o instanceof Rekening)) {
            return false;
        }
        var rek = (Rekening) o;
    return rekeningNummer.equals(rek.rekeningNummer);
    }
}

