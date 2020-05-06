package be.vdab.jpfhfdst7;

public class Rekening {
    private String rekeningNummer;
    private double saldo;
    public Rekening(String rekeningNummer) {
        this.rekeningNummer = rekeningNummer;
    }
    public Rekening(String rekeningNummer, double saldo) {
        this.rekeningNummer = rekeningNummer;
        this.saldo = saldo;
    }
    public String getRekeningNummer() {
        return rekeningNummer;
    }
    public void setRekeningNummer(String reknr) {
        rekeningNummer = reknr;
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
}

