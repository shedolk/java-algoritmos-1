import java.util.Scanner;

public class exercicio01lista3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, contador = 0;
        System.out.println("digite um numero :");
        numero = leitor.nextInt();
        contador++;
        while (numero >= 0) {
            System.out.println("digite um numero :");
            numero = leitor.nextInt();
            contador++;
        }
        System.out.println("foram digitados " + contador + " numeros");

    }

}
