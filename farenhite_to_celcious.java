import java.util.Scanner;

public class farenhite_to_celcious {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();
        while (S <= E) {
            int fah = (5 * ((S - 32)) / 9);
            System.out.println(S + " " + fah);
            S = S + W;
            s.close();
        }
    }
}
