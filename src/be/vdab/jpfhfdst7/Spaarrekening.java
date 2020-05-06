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
}

