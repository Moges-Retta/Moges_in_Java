package takenBundle;

public class Kaart {
    private String[] kleuren = {"harten", "ruiten", "klaveren" , "schoppen"};
    private String[] rangen = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "vrouw", "heer", "aas"};
    int kleur, rang;
    public Kaart(){
        kleur = (int)(Math.random()*4);
        rang = (int)(Math.random()*13);
    }
    public void printKaart(Kaart kaart){
        System.out.println("De kleur is "+kleuren[kaart.kleur]+" rang "+rangen[kaart.rang]);
    }
    public static boolean isHooger(Kaart kaart1,Kaart kaart2){
        boolean b = false;
        return kaart1.kleur > kaart2.kleur||kaart1.kleur==kaart2.kleur&&kaart1.rang>kaart2.rang;
    }
}
