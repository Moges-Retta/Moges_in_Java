package takenBundle;
public class Waarnemer {
    private int maxTemp;
    private int minTemp;
    private int aantalWaarnemingen;
    private double somTemp;
    public int getMaxTemp() {
        return aantalWaarnemingen > 0 ? maxTemp : 0;
    }
    public int getMinTemp() {
        return aantalWaarnemingen > 0 ? minTemp : 0;
    }
    public int getAantalWaarnemingen() {
        return aantalWaarnemingen;
    }
    public double getGemTemp() {
        return aantalWaarnemingen > 0 ? somTemp/aantalWaarnemingen : 0;
    }
    public void registreer(int temp) {
        somTemp += temp;
        if(aantalWaarnemingen==0){minTemp=temp;}
        aantalWaarnemingen++;
        if (temp > maxTemp) {
            maxTemp = temp;
        }
        if (temp < minTemp) {
           minTemp = temp;
        }
    }
}
/**public class Waarnemer {
    private float[] temperatuur;
    public Waarnemer(float[] temp){
        setTemperatuur(temp);
    }
    public static int aantal(float[] temp){
        return temp.length;
    }
    public static float minTemperatuur(float[] temp){
        float[] gesoorteerd = soorteren(temp);
        return gesoorteerd[0];
    }
    public static float maxTemperatuur(float[] temp){
        float[] gesoorteerd = soorteren(temp);
        return gesoorteerd[gesoorteerd.length-1];
    }
    public static float gemiddelde(float[] temp){
        float som = 0;
        for(var i=0;i!=temp.length;i++){
            som+=temp[i];
        }
        return som/temp.length;
    }
    public float[] getTemperatuur() {
        return temperatuur;
    }

    public void setTemperatuur(float[] temperatuur) {
        this.temperatuur = temperatuur;
    }
    private static float[] soorteren(float[] temp){
        for(var i=0;i!=temp.length;i++){
            for(var j=i+1;j!=temp.length;j++){
                if(temp[j]<temp[i]){
                    var t = temp[j];
                    temp[i]=temp[j];
                    temp[j]=t;
                }
            }
        }
        return temp;
    }
}*/
