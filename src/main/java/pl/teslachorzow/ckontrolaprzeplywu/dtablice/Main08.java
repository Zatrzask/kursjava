package pl.teslachorzow.ckontrolaprzeplywu.dtablice;

public class Main08 {
    public static void main(String[] args) {
        double celcjusz [] = {4, 112, 643, 9999, -69};
        double fahrenhait [] ;
        for(int i =0; i< celcjusz.length; i++){
            fahrenhait [i] = celcjusz[i] * 1.8 + 32;
            System.out.println(fahrenhait[i]);
        }

    }
}
