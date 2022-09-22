import java.util.Scanner;

public class exercicio11lista2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int lado1, lado2, lado3;
        System.out.println("Qual o tamanho do primeiro lado ?");
        lado1 = leitor.nextInt();
        System.out.println("Qual o tamanho do segundo lado ?");
        lado2 = leitor.nextInt();
        System.out.println("Qual o tamanho da base ?");
        lado3 = leitor.nextInt();

        if (lado1 < lado2) {

            System.out.println("triangulo invalido !! ");

        }

    }
}
