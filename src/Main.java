import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        float [] begrenzung = new float [2];
        begrenzung[0] =0.5f;
        begrenzung[1] =0.7f;
        float ergebnis = begrenzteZufallsZahl(begrenzung);
        System.out.println(ergebnis);


    }
    public static float begrenzteZufallsZahl(float[] begrenzung){
        //generieren
        boolean gefunden =true;
        while (gefunden){


            float zufallsZahl = (float) Math.random();

            gefunden =false;
            // ist enthalten?
            for (int i = 0; i<begrenzung.length;i++){
                float schublade = begrenzung[i];
                // ja-> neue generieren
                if(zufallsZahl == schublade){
                    gefunden =true;
                }
            } //nein ->zurück geben
            if (gefunden ==false){
                return zufallsZahl;
            }
        }
        return  -1;
    }
}
