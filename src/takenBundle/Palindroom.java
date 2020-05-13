package takenBundle;

public class Palindroom {
    private String tekst;
    private boolean isPalindroom;
    public Palindroom(String tekst){
        setTekst(tekst);
        this.isPalindroom = checkPalindroom(tekst);
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
        this.isPalindroom = checkPalindroom(tekst);
    }

    public boolean isPalindroom() {
        return isPalindroom;
    }

    public boolean checkPalindroom(String input){
        var tekst2 = new StringBuilder(input);
        return input.equals(tekst2.reverse().toString());
    }
    @Override
    public String toString() {
        return tekst + ";" + isPalindroom;
    }
}
