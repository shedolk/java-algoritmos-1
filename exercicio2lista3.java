import java.util.Scanner;

public class exercicio2lista3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int pares = 0, impares = 0, numero;
        for (int i = 0; i < 10; i++) {
            System.out.println("digite um numero :");
            numero = leitor.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("pares : "+pares );
        System.out.println("impares : "+impares );
    }
}
