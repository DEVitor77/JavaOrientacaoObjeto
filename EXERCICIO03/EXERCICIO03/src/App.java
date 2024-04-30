import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner tx = new Scanner(System.in);

        int A,B,C,D;

        A=tx.nextInt();
        B=tx.nextInt();
        C=tx.nextInt();
        D=tx.nextInt();

        int DIFERENCA = (A*B-C*D);    

        System.out.printf("DIFERENCA = " + DIFERENCA);


        tx.close();
    }
}
