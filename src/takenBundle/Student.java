package takenBundle;

public class Student {
    private String naam;
    private int score;
    public Student(String naam){
        setNaam(naam);
    }
    public Student(String naam, int score){
        setScore(score);
        setNaam(naam);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
