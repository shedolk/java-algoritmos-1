import java.util.Scanner;
public class exercicio3lista3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero=1,maior=0;
        while (numero!=0) {
            System.out.println("digite um numero positivo :");
            numero = leitor.nextInt();
           
             if ((numero>maior)&&(numero!=0)) {
                maior=numero;
                
            }
            
        }
        System.out.println(maior);
    }
}
