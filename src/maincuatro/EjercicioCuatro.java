package maincuatro;
import java.util.Scanner;
public class EjercicioCuatro {
    public static void main(String[] args) {
        /*
            EJERCICIO 4
                Ernesto necesita encontrar el tipo de triangulo deseado
                ya sea equilátero, isósceles o escaleno. Para esto
                necesitamos la longitud en cm de cada lado, ayuda a Ernesto
                creando un codigo para encontrar el tipo de triangulo
                que desea.
        */
        Scanner entradaDatos = new Scanner(System.in);
        System.out.print("Ingresa la longitud del primer lado en cm: ");
        var longUno = entradaDatos.nextDouble();
        System.out.print("Ingresa la longitud del segundo lado en cm: ");
        var longDos = entradaDatos.nextDouble();
        System.out.print("Ingresa la longitud del tercer lado en cm: ");
        var longTres = entradaDatos.nextDouble();
        
        //String tipoTriangulo = "";
        
        if (longUno == longDos && longUno == longTres) {
            //tipo tipoTriangulo = "El triangulo es Equilatero";
            System.out.println("El triangulo es Equilatero");
        } else if (longUno == longDos || longDos == longTres || longTres == longUno) {
            //tipo tipoTriangulo = "El triangulo es Isoseles";
            System.out.println("El triangulo es Isoseles");
        } else {
            //tipo tipoTriangulo = "El triangulo es Escaleno";
            System.out.println("El triangulo es Escaleno");
        }
    }
}
