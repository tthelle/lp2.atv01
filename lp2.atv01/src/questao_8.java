import java.util.Scanner;
public class questao_8 {
    public static void main(String[] args){
        float area;
        float pi = 3.14f;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o raio da circunferência: ");
        float raio = teclado.nextFloat();

        area = pi * (raio * raio);

        System.out.println("A área da circunferência é: " + area);
    }
}
