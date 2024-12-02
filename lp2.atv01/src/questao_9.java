import java.util.Scanner;
public class questao_9 {
    public static void main(String[] args){
        float salBruto, salLiquido;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Valor da hora-aula: ");
        float valorHora = teclado.nextFloat();
        System.out.print("Quantidade de horas trabalhadas: ");
        float horasTrab = teclado.nextFloat();
        System.out.print("Percentual de desconto do INSS: ");
        float desconto = teclado.nextFloat();

        salBruto = valorHora * horasTrab;
        salLiquido = salBruto - (desconto / 100);

        System.out.println("Salário lìquido do professor: " + salLiquido);
    }
}
