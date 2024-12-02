import java.util.Scanner;
public class questao_6 {
    public static void main(String[] args){
        int divisor = 3;
        float media;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Nota da prova 1: ");
        float nota1 = teclado.nextFloat();
        System.out.print("Nota da prova 2: ");
        float nota2 = teclado.nextFloat();
        System.out.print("Nota do trabalho: ");
        float nota3 = teclado.nextFloat();

        media = (nota1 + nota2 + nota3) / divisor;

        if (media < 7) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Aprovado!");
        }
    }
}
