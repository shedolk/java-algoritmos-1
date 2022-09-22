import java.util.Scanner;

public class exercicio13lista2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double salario;
        int dependentes;
        System.out.println("Qual o salario do danado ?");
        salario = leitor.nextDouble();
        System.out.println("Quantos dependentes esse garotinho tem ?");
        dependentes = leitor.nextInt();

        dependentes = dependentes * 200;

        if (salario <= 1500) {
            salario = (salario - (salario * 0.10)) + dependentes;
            System.out.println("Este é o salario liquido do danado " + salario);
        }
        // orangutango

        else if (salario <= 3500) {
            salario = (salario - (salario * 0.125)) + dependentes;
            System.out.println("Este é o salario liquido do danado " + salario);
        } else if (salario <= 5500) {
            salario = (salario - (salario * 0.15)) + dependentes;
            System.out.println("Este é o salario liquido do danado " + salario);
        } else if (salario > 5500) {
            salario = (salario - (salario * 0.20)) + dependentes;
            System.out.println("Este é o salario liquido do danado " + salario);
        }

    }
}
