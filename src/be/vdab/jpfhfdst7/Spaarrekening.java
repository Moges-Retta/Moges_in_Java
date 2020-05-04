package be.vdab.jpfhfdst7;

public class Spaarrekening {
    private String rekeningNummer;
    private double saldo;
    private double intrest;
    public Spaarrekening(String reknr, double intrest) {
        rekeningNummer = reknr;
        this.intrest = intrest;
    }
    public Spaarrekening(String reknr, double intrest, double saldo) {
        this(reknr, intrest);
        this.saldo = saldo;
    }
    public String getRekeningNummer(){
        return rekeningNummer;
    }
    public void setRekeningNummer(String reknr) {
        rekeningNummer = reknr;
    }
    public double getSaldo(){
        return saldo;
    }
    public void storten (double bedrag) {
        saldo += bedrag;
    }
    public void afhalen (double bedrag) {
        saldo -= bedrag;
    }
    public void overschrijven(Spaarrekening spaarRek, double bedrag) {
        saldo -= bedrag;
        spaarRek.storten(bedrag);
    }
}

