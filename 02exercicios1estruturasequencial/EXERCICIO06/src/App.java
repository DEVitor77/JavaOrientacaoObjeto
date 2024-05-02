import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float A, B, C;
        float TRI, CIR, TRA, QUA, RET;
        Double pi;

        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();
        pi = 3.14159;   

        // TRI = sc.nextFloat();
        // CIR = sc.nextFloat();
        // TRA = sc.nextFloat();
        // QUA = sc.nextFloat();
        // RET = sc.nextFloat();

        System.out.printf("TRIANGULO: %.3f%n", A*C/2.0);
        System.out.printf("CIRCULO: %.3f%n", (pi*C*C));
        System.out.printf("TRAPEZIO: %.3f%n", ((A+B) / 2.0 *C));
        System.out.printf("QUADRADO: %.3f%n", B*B );
        System.out.printf("RETANGULO: %.3f%n", A*B);
        
    }
}
