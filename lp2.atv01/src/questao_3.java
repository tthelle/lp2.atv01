import java.util.Scanner;
public class questao_3 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        int idade = teclado.nextInt();

        if (idade > 18){
            System.out.println("Você ainda não pode tirar a carteira de motorista.");
        } else {
            System.out.println("Você já pode tirar a carteira de motorista!");
        }
    }
}
