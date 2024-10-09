public class Main {
    public static void main(String[] args) {
        String[] stringArray = new String[1];
        stringArray[0] = "Hallo Welt";
        String ersteSchublade = stringArray[0];
        System.out.println(ersteSchublade);
        int[] intArray = new int[3];
        intArray[0]=0;
        intArray[1]=1;
        intArray[2]=2;

        int ersteZahl = intArray[0];
        int zweiteZahl = intArray[1];
        int dritteZahl = intArray[2];

        int zahlenGes = ersteZahl + zweiteZahl + dritteZahl;
        System.out.println(zahlenGes);

    }
}
