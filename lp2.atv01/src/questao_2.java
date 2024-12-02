import java.util.Scanner;
public class questao_2 {
    public static void main(String[] args){
        float litros, custo;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Distância que será percorrida, em Km: ");
        float distancia = teclado.nextFloat();

        System.out.print("Preço atual da gasolina: ");
        float precoGaso = teclado.nextFloat();

        litros = distancia / 12;
        custo = precoGaso * litros;

        System.out.println("Quantidade de gasolina a ser colocada: " + litros + "\nCusto total da gasolina: R$" + custo);
    }
}
