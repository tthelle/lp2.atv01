import java.util.Scanner;
public class questao_1 {
    public static void main(String[] args) {

        int salario;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidade de horas trabalhadas: ");
        int horas = teclado.nextInt();
        salario = horas * 20;

        System.out.println("Salário recebido: R$ " + salario);
    }
}