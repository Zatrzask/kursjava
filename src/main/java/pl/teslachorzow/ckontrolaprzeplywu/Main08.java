package pl.teslachorzow.ckontrolaprzeplywu;

public class Main08 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n;i++) {
            String row = " ";
            for (int j = 0; j < 5; j++) {
                row += "*";
            }
            System.out.println(row + "\n");
        }

    }
}