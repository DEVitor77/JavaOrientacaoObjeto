import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int primeiroNumero = sc.nextInt();
        int segundoNumero = sc.nextInt();
        int Soma = primeiroNumero + segundoNumero;

        System.out.printf("SOMA = " + Soma);

        sc.close();
    }
}
