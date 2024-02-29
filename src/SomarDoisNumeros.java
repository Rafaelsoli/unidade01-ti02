import java.util.Scanner;

public class SomarDoisNumeros {
    
    public static int calcularSoma (int num1, int num2) {
        return num1 + num2;
    }

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        

        System.out.println("Digite o primeiro numero: ");
        int primeiro_numero = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        int segundo_numero = scan.nextInt();

        int resultado = calcularSoma(primeiro_numero, segundo_numero);

        System.out.println("Soma: " + resultado);

        scan.close();
    }
}