import java.util.Scanner;
public class exercicio4lista3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        float numero,razao;
        System.out.println("digite um numero :");
        numero = leitor.nextFloat();
        System.out.println("qual a razão ?");
        razao = leitor.nextFloat();
        for (int i = 0; i < 10; i++) {
            numero=numero+razao;
            System.out.println("numero igual"+numero);
        }
    }
}
