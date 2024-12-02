import java.util.Scanner;
public class questao_11 {
    public static void main(String[] args){
        int soma;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int num1 = teclado.nextInt();
        System.out.print("Insira o segundo número: ");
        int num2 = teclado.nextInt();

        soma = num1 + num2;

        if (soma >= 10){
            soma += 5;
            System.out.println("Resultado: " + soma);
        } else {
            soma -= 7;
            System.out.println("Resultado: " + soma);
        }
    }
}
