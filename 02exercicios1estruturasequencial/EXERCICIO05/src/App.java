import java.lang.reflect.AccessFlag.Location;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int peca1, peca2, nunpeca1, nunpeca2;
        float vlrunit1, vlrunit2;

        peca1 = sc.nextInt();
        nunpeca1 = sc.nextInt();
        vlrunit1 = sc.nextFloat();
        peca2 = sc.nextInt();
        nunpeca2 = sc.nextInt();
        vlrunit2 = sc.nextFloat();

        System.out.printf("VALOR A PAGAR: R$ %.2f%n" , (nunpeca1 * vlrunit1 + nunpeca2 * vlrunit2));
        


        sc.close();
    }
}
