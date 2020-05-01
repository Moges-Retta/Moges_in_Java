package takenBundle;

public class RandomGetallen2 {
    public static void main(String[] args) {
        var array = new int[100];
        for (var i=0;i!=array.length;i++){
            array[i]=(int)(Math.random()*1000+1);
        }
        for (var i=0;i!=array.length;i++) {//sorteren
            for (var j=i+1;j!=array.length;j++) {
                    if(array[i]> array[j]){
                        var temp = array[i];
                        array[i]=array[j];
                        array[j]=temp;
                    }
            }
        }
        for (var i=0;i!=array.length;i++) {
           System.out.println(array[i]);
        }
    }
}
