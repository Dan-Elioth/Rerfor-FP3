

import java.util.Scanner;

public class RepasoESTSecuencial {

    static Scanner teclado=new Scanner(System.in);

    public static void areatriangulo() {
        //Datos de entrada y el proceso
        double b=0, h=0;
        //necesitamos que nos pueda imprimir el valor de esa dos variables
        //formula=b*h/2
        
        System.out.println("Ingrese la base:");
        b=teclado.nextDouble();
        System.out.println("Ingrese la altura:");
        h=teclado.nextDouble();

        System.out.println("El area de tu triangulo es de:"+b*h/2);

    }
    public static void Cambiomoney() {
        //variables
        double saldo=0;
        double cambio=3.75;
        //Datos de entrada y al proceso
        System.out.println("Hey bro ingresa tu money:");
        saldo=teclado.nextDouble();

        System.out.println("Tu saldo en dolares es de: $"+saldo/cambio);
    }
    
    public static void potencia() {
        double numero = 11;
		double cuadrado = Math.pow(numero, 3);
		System.out.println("11 elevado al cubo es " + cuadrado);
        
    }


    public static void main(String[] args) {
        System.out.println("Joven, hoy veremos cuan misio estas!!");
        //areatriangulo();
        //Cambiomoney();
        potencia();

    }
    
}
