import java.util.Scanner;

public class CovertidorBinario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero que quieras convertir a binario: ");

        int entero = sc.nextInt();

        System.out.println("El numero binario del numero: " + entero + " es: " + convertidorBinario(entero));


    }

    public static String convertidorBinario(int numero){
        return Integer.toBinaryString(numero);
    }
}
