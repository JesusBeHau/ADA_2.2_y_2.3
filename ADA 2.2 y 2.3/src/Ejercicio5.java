import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception{
        Scanner lectura=new Scanner(System.in);

        Double r, area, perimetro;

        System.out.println("Ingrese el radio del circulo: ");
        r = lectura.nextDouble();

        area=Math.PI*Math.pow(r,2);
        perimetro=Math.PI*(r+r);

        System.out.println("El área del circulo es: "+area+" el perimetro del circulo es: "+perimetro);
    }
}
