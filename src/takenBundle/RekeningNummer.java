package takenBundle;

public class RekeningNummer {
    public static void main(String[] args) {
        //var rekeningNummer = 823445816730L;// geldig
        var rekeningNummer = 111224444891L;
        var laatste = rekeningNummer%100;
        long firstTien = (rekeningNummer-laatste)/100;
        var rest = firstTien%97;
        System.out.println(laatste==rest);
        var getallen = new int[4][]; //voor elk element in de array wordt er een array van ints gemaakt
         getallen[0] = new int[5];
         getallen[1] = new int[]{1,2,3,4,5,6,7};
         getallen[2] = new int[3];
         getallen[3] = new int[4];
        System.out.println(getallen[1][5]);
    }
}
