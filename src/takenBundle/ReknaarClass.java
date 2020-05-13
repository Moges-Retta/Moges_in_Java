package takenBundle;

import java.util.Arrays;

public class ReknaarClass {
    private String tekst;
    private int totaal;

    public ReknaarClass() {
    }

    public ReknaarClass(String tekst) {
        setTekst(tekst);
        this.totaal = brekenTotaal(tekst);
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
        this.totaal = brekenTotaal(tekst);
    }

    public int getTotaal() {
        return totaal;
    }

    public void setTotaal(int totaal) {
        this.totaal = totaal;

    }

    public int brekenTotaal(String tekst) {
        if (tekst.equals("")) {
            return 0;
        } else {
            return reken(tekst);
        }
    }

    public int reken(String tekst) {
        var gesplit = tekst.split(" ");
        var som = Integer.parseInt(gesplit[0]);
        for (var i = 1; i != gesplit.length; i++) {
            switch (gesplit[i].charAt(0)) {
                case ('+'):
                    som += Integer.parseInt(gesplit[i + 1]);
                    break;
                case ('-'):
                    som -= Integer.parseInt(gesplit[i + 1]);
                    break;
                case ('*'):
                    som *= Integer.parseInt(gesplit[i + 1]);
                    break;
                case ('/'):
                    som /= Integer.parseInt(gesplit[i + 1]);
                    break;
            }
        }
        return som;
    }
    @Override
    public String toString() {
        return tekst + ";" + totaal;
    }
}
