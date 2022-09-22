import java.util.Scanner;

public class exercicio9lista2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float frente1, lateral1;
        System.out.println("Qual a largura do terreno em questão ?");
        frente1 = leitor.nextFloat();
        System.out.println("Qual o comprimento do terreno em questão ?");
        lateral1 = leitor.nextFloat();

        if (frente1 > lateral1) {
            System.out.println("Então construa uma casa larga :");
        } else if (frente1 == lateral1) {
            System.out.println("o terreno está ideal para fazer a casa :");
        } else {
            System.out.println("Então construa uma casa longa :");
        }

    }

}
