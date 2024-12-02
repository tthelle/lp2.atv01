import java.util.Scanner;
public class questao_4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual é a temperatura atual do corpo do paciente? ");
        float temp = teclado.nextFloat();

        if (temp > 37){
            System.out.println("O paciente está com febre.");
        } else {
            System.out.println("O paciente não está com febre.");
        }
    }
}
