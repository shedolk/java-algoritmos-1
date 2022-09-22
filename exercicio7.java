import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String time1, time2;
        int gols1, gols2;
        System.out.println("Qual o nome do primeiro time ?");
        time1 = leitor.nextLine();
        System.out.println("Qual o nome do segundo time ?");
        time2 = leitor.nextLine();
        System.out.println("Quantos gols " + time1 + " fez ? ");
        gols1 = leitor.nextInt();
        System.out.println("Quantos gols " + time2 + " fez ? ");
        gols2 = leitor.nextInt();
        if (gols1 > gols2) {
            System.out.println(time1 + " venceu com " + gols1 + " gols");
        } else if (gols1 == gols2) {
            System.out.println("empate, os dois times com " + gols1 + " gols");
        } else {
            System.out.println(time2 + " venceu com " + gols2 + " gols");
        }
    }
}
