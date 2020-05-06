package be.vdab.jpfhfdst7;

public class Spaarrekening extends Rekening{

    private static double intrest;
    public Spaarrekening(String reknr, double intrest) {
        this(reknr, intrest, 0.0);
   }
    public Spaarrekening(String reknr, double intrest, double saldo) {
        super(reknr, saldo);
        Spaarrekening.intrest = intrest;
    }
    public static double getIntrest(){
        return intrest;
    }
    @Override
    public void afhalen(double bedrag) {
        if (bedrag > 0.0) {
            var testSaldo = getSaldo()- bedrag;
            if (testSaldo >= 0) {
                super.afhalen(bedrag);
            }
        }
    }
}

