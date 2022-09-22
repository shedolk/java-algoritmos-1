import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double carne, valorfinal;
        int criancas, adultos;
        System.out.println("Qual o preço da carne?");
        carne = leitor.nextDouble();
        System.out.println("Quantas crianças vão ter?");
        criancas = leitor.nextInt();
        System.out.println("Quantos adultos vão?");
        adultos = leitor.nextInt();
        valorfinal = ((criancas) * 0.2 + (adultos) * 0.4) * carne;
        System.out.println("o valor do churras é " + valorfinal);

    }

}