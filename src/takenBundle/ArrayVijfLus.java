package takenBundle;

public class ArrayVijfLus {
    public static void main(String[] args) {
        var array = new int[5];
        var som = 0;
        for (var i=0;i!=array.length;i++){
            array[i]=(int)(Math.random()*100)+1;
            System.out.println(array[i]);
            som+=array[i];
        }
        System.out.println("De som is " + som);
        System.out.println("De gemiddleld is "+ som/array.length);
    }
}
