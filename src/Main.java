public class Main {
    public static void main(String[] args) {
        System.out.println(berechnen(2));
     }
    public static int berechnen(int i){
        if (i ==0){
            return i;
        }
        for (; i<10 ; ){
            i=i*i;
        }return i;
    }
}
