import java.util.Scanner;

public class EStCondicionales {
    static Scanner teclado=new Scanner(System.in);

    public static void estsimples() {

        //varaibles

        int numero=0, divisor=0;
        double conciente=0;

        //datos de entrada
        //nos divida un numero de tipo entero, que no ingrese ese dato desde el teclado

        System.out.print("Ingresa el numero que quieres dividir:");
        numero=teclado.nextInt();
        System.out.println("Ingresa el divisor:");
        divisor=teclado.nextInt();

        if(numero!=0){
            conciente=numero/divisor;
            System.out.println("El cociente es:"+conciente);
        }

    }

    public static void estconelse() {
        int numero1=0;
        //datos de entrada y proceso
        System.out.println("Ingresa el numero:");
        numero1=teclado.nextInt();

        if(numero1<0){
            System.out.println("Este numero es negativo");

        }else{
            if(numero1==0){
                System.out.println("Este numero es nulo");
            }else{
                System.out.println("Este numero es positivo");
                
            }
        }
    }

    public static void verificadordelahora() {
        int H=0,M=0,S=0;
        //datos de entrada y proceso
        System.out.println("Ingresa la hora:");
        H=teclado.nextInt();
        System.out.println("Ingresa los minutos:");
        M=teclado.nextInt();
        System.out.println("Ingresa los segundo");
        S=teclado.nextInt();

        if(H>=0 && H<=24 && M>=0 && M<60 && S>=0 && S<60){
            System.out.println("La hora has indicado es correacta");

        }else{
            System.out.println("los datos que puesto son incorrectos");
        }
        
    }

    public static void Ejercicio2() {

        int temperatura=0, clima=0;
        //datos de entrada y proceso
        System.out.println("ingresa la temperatura en la que te encuentras:");
        temperatura=teclado.nextInt();

        System.out.println("Ingresa de como esta tu clima:\n Hace sol=1\nEsta caendo lluvia=2\nEsta haciendo frio");
        clima=teclado.nextInt();

        if(temperatura>25){
            System.out.println("hey bro, que haces en tu casa, corre a la playa!!");
        }else{
            System.out.println("Manito quedate en casa, esta haciendo frio, depaso hay covid");
        }
        if(clima==1){
            System.out.println("Manito, llevate un sombrilla, o sino te vas quemar");
        }else{
            if(clima==2){
                System.out.println("No salgas porque te vas a mojar, de paso te vas a resfriar ");
            }else{
                System.out.println("Abrigate porque si no te vas a resfriar");
            }
        }
        


        
    }



    public static void main(String[] args) {
        //estsimples();
        //estconelse();
        verificadordelahora();
        //Ejercicio2();
        
    }
    
}
