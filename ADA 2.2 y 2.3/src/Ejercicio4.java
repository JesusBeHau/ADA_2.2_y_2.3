import java.util.Scanner;

public class Ejercicio4 {
    double numero,resultado;

    public void metodo(){
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el número: ");
        numero=lectura.nextDouble();

        resultado=Math.pow(numero,3);

        System.out.println("El resultado de elevar el número al cubo es: "+resultado);
    }
}
