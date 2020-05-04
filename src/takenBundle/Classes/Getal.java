package takenBundle.Classes;

public class Getal {
    private int x;
    public void print(){
        System.out.println(x);
    }
    public Getal(int a){
        setX(a);
    }
    public int abs(int a){
        return Math.abs(a);
    }
    public int som(int a){
        return a+x;
    }
    public float som(float a){
        return a+x;
    }
    public double som(double a){
        return a+x;
    }
    public int add(int a){
        return x+=a;
    }
    public double toDouble(){
        return (double)x;
    }

    public int getX() {
        return x;
    }

    public void setX(int a) {
        this.x = a;
    }
}
