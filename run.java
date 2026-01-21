package classroom;

import java.util.Scanner;

public class run {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int order = sc.nextInt();
        LTM M = new LTM(order);
        M.read();
        LTM N = new LTM(order);
        N.read();
        M.add(N);
        // M.mul(N);
        M.print();

    }
}
