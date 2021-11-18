package pl.teslachorzow.ckontrolaprzeplywu.dtablice;

import javax.swing.plaf.IconUIResource;

public class MAin04 {
    public static void main(String[] args) {
        int sumOdd = 0;
        int sum = 0;
        int numbers [] = {4, 643, 112, 9999, 69};
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i]%2 == 0)
                System.out.println(numbers[i]);
            else
                sum += numbers[i];

        }
        System.out.println("SUMA: " + sum);
    }
}
