import java.util.Scanner;

public class sum_of_evennumber_till {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
        s.close();
    }

}
