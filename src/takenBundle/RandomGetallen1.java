package takenBundle;

public class RandomGetallen1 {
    public static void main(String[] args) {
        var array = new int[10_000];
        for (var i=0;i!=array.length;i++){
            array[i]=(int)(Math.random()*100)+1;
        }
        for(var i=0;i!=array.length;i++){
           System.out.println((i+1)+" : "+array[i]);
        }
    }
}
