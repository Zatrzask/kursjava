package pl.teslachorzow.ckontrolaprzeplywu;

public class Main11 {
    public static void main(String[] args) {
        int n = 2000;
        for (int i =0; i < n; i ++) {
          String row = " ";
           if (i%2 == 0)
               row += i + 1;
           else
               row += "*";
            System.out.print(row);
            if (i%10 == 0)
                System.out.println();
             }

    }

}
