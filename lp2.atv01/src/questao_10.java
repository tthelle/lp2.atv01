import java.util.Scanner;
public class questao_10 {
    public static void main(String[] args){
        int soma;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int num1 = teclado.nextInt();
        System.out.print("Insira o segundo número: ");
        int num2 = teclado.nextInt();

        soma = num1 + num2;

        if (soma > 10){
            System.out.println("Resultado da soma dos números: " + soma);
        } else {
            System.out.println("A soma desses dois números não é maior que 10.");
        }
    }
}
