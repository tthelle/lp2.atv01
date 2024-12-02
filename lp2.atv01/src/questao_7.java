import java.util.Scanner;
public class questao_7 {
    public static void main(String[] args){
        //Faça um algoritmo utilizando a representação de fluxograma que leia o peso e a altura do
        //usuário e informa se o mesmo está obeso. Lembre que para saber se uma pessoa está obesa
        //deve-se utilizar a fórmula: imc = peso/altura2. Caso o resultado do imc seja maior que 30 o
        //usuário está obeso.
        float imc;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o peso: ");
        float peso = teclado.nextFloat();
        System.out.print("Insira a altura: ");
        float altura = teclado.nextFloat();

        imc = peso/(altura * 2);

        if (imc > 30){
            System.out.println("O usuário está obeso.");
        } else {
            System.out.println("O usuário não está obeso.");
        }
    }
}
