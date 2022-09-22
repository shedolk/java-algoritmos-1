import java.util.Scanner;
public class exercicio10lista2 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    double capacidade,pessoas,valorfinal;
    System.out.println("Qual a capacidade do estadio ?");
    capacidade = leitor.nextDouble();
    System.out.println("Quantas pessoas estão presentes ?");
    pessoas = leitor.nextDouble();
    if ((capacidade*0.8)>=pessoas){
        System.out.println("Está lotado o estadio :");
    }
    if ((capacidade*0.5)<=pessoas){
        System.out.println("O estadio está parcialmente lotado :");
    }
    if ((capacidade*0.20)<=pessoas){
        System.out.println("O estadio está vazio :");
    }
    
   }
}
