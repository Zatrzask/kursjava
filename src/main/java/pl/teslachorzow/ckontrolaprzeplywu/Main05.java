package pl.teslachorzow.ckontrolaprzeplywu;

public class Main05 {
    public static void main(String[] args) {
        int resultfor = 0;
        int resultwhile = 0;
        for (int x =0; x <= 10; x++)  {
            resultfor += x;
        }
        System.out.println(resultfor);
        int y = 0;
        while (y <= 10) {
            resultwhile += y;
            y++;

        }
        System.out.println(resultwhile);
    }
}
