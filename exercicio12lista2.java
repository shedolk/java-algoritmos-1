import java.util.Scanner;
public class exercicio12lista2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String time1,time2;
        float gols1,gols2,valorfinal1,valorfinal2,empate1,empate2;
        System.out.println("Qual o nome do primerio time ? ");
        time1 = leitor.next();
        System.out.println("Qual o nome do segundo time ?");
        time2 = leitor.next();
        System.out.println("Quantos gols o primerio time fez ?");
        gols1 = leitor.nextFloat();
        System.out.println("Quantos empates o primeiro time tem ?");
        empate1 = leitor.nextFloat();
        System.out.println("Quantos gols o segundo time fez ?");
        gols2 = leitor.nextFloat();
        System.out.println("Quantos empates o segundo time tem  ?");
        empate2 = leitor.nextFloat();

        valorfinal1 = ((gols1)*3) + empate1;

        valorfinal2 = ((gols2)*3) + empate2;

        if (valorfinal1>valorfinal2) {
            System.out.println("está mais bem classificado o time "+time1+" com "+gols1+" gols");      
        }
        if (valorfinal1==valorfinal2) {
            System.out.println("empate entre os times "+time1+" e "+time2);   
        }
        else{
            System.out.println("está mais bem classificado o time "+time2+" com "+gols2+" gols");
        }
    }
    
}
