import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double width = sc.nextDouble();
        double length = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = width * length;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n" , area);
        System.out.printf("PREÇO = %.2f%n" , preco);


        sc.close();
        
    }
}
