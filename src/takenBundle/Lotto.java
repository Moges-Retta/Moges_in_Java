package takenBundle;

public class Lotto {
    public static void main(String[] args) {
        var  lotto= new int[7];
        var teller = 0;
        while(lotto[lotto.length-1]==0){
            var temp = (int)(Math.random()*42+1);
            var count = 0;
            for(var j=0;j!=lotto.length;j++){
                if(lotto[j]==temp){
                    count+=1;// hoeveel keer
                }
            }
            if(count==0){//uniek
                lotto[teller]=temp;
                teller+=1;
            }
        }
        for (var i=0;i!=lotto.length;i++) {
            System.out.print(lotto[i]+" ");
        }
    }
}
