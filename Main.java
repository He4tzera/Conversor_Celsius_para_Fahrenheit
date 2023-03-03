
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input_resposta ='y';
        do {
            System.out.printf("Insira a temperatura em celsius:");
            double temp1;
            temp1 = sc.nextDouble();
            double temp2 = temp1 * 1.8 + 32;
            System.out.println("A temperatura em Fahrenheit é:" + temp2);
            System.out.printf("Deseja realizar uma nova consulta: Y/N ");
            input_resposta = sc.next().charAt(0);
        }while (input_resposta !='n');
        sc.close();
    }
}