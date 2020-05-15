package takenBundle.Voorwerpen;

public class Boek {
    private String title;
    private  String auteur;
    private  String eigenaar;
    private float aankoopprijs;
    private String genre;

    public Boek(){
    }
    public Boek(String title,String auteur,String eigenaar,float aankoopprijs,String genre){
        setTitle(title);
        setAuteur(auteur);
        setEigenaar(eigenaar);
        setAankoopprijs(aankoopprijs);
        setGenre(genre);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title!=null&&!title.isEmpty())
            this.title = title;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        if(auteur!=null&&!auteur.isEmpty())
            this.auteur = auteur;
    }

    public String getEigenaar() {
        return eigenaar;
    }

    public void setEigenaar(String eigenaar) {
        if(eigenaar!=null&&!eigenaar.isEmpty())
            this.eigenaar = eigenaar;
    }

    public float getAankoopprijs() {
        return aankoopprijs;
    }

    public void setAankoopprijs(float aankoopprijs) {
        this.aankoopprijs = aankoopprijs;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String toString() {
        return getAuteur()+";"+getGenre()+";"+getEigenaar()+";"+getTitle()+";"+getAankoopprijs();
    }

}
