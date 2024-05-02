import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numfunc;
        float hrTrabalhadas, vlrHora, salary;

        numfunc = sc.nextInt();
        hrTrabalhadas = sc.nextFloat();
        vlrHora = sc.nextFloat();
        salary = hrTrabalhadas * vlrHora;
        
        System.out.printf("NUMBER = " + numfunc);
        System.out.println();
        System.out.printf("SALARY = U$ %.2f%n" ,salary);


        sc.close();
        
    }
}
