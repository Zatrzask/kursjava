package pl.teslachorzow.ckontrolaprzeplywu;

public class Main06 {
    public static void main(String[] args) {
        int n = 6;
        for (int x = 0; x <= n; x++) {
            System.out.print(x);
            if ((x % 2) == 0)
                System.out.println(" - parzysta");
            else
                System.out.println(" - nieparzysta");
        }
        int y = 0;
        while (y <= n) {

            System.out.print(y);

            if ((y % 2) == 0)
                System.out.println(" - parzysta");
            else
                System.out.println(" - nieparzysta");
            y++;
        }

    }
}
