import java.util.Scanner;
public class questao_5 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int num1 = teclado.nextInt();
        System.out.print("Insira o segundo número: ");
        int num2 = teclado.nextInt();

        if (num1 > num2){
            System.out.println(" " + num1 + " é o maior número.");
        } else if (num2 > num1){
            System.out.println(" " + num2 + " é o maior número.");
        } else {
            System.out.println("Os dois números são iguais.");
        }
    }
}
