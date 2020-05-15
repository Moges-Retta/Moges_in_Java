package vdab.be.jpfhfdst10;

public interface Afschrijving {
    int termijn(); //is impliciet public abstract
    double jaarlijksBedrag(); //idem
    default double tienjaarstermijn(){
        return 10;
    }
    static void beschrijving(){
        System.out.println("Een investering of aankoop verdelen over een " + "bepaalde termijn.");
    }
}
