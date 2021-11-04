package pl.teslachorzow.ckontrolaprzeplywu;

public class Main02 {
    public static void main(String[] args) {
        int nr1 = 3;
        int nr2 = 7;
        int nr3 = 11;
        if (nr1 > nr2 && nr1 > nr3) {
            System.out.println("Najwieksza jest liczba " + nr1);
        } else if (nr3 > nr2 && nr3 > nr1) {
            System.out.println("Najwieksza jest liczba " + nr3);
        } else {
            System.out.println("Najwieksza jest liczba " + nr2);
        }
    }
}