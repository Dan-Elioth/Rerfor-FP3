import java.util.Scanner;

public class EstructurasSelectivasMultiples {

    public static void docente() {
        Scanner tec=new Scanner(System.in);
        

        System.out.println("Ingrese el nivel del docente\nadjunto=1\nauxiliar=2\nasistente=3\nconserje=4\nmate=5");
        String nivel=tec.next();
        System.out.println("Ingresa tu salario");
        Double salario=tec.nextDouble();

        //datos de entrada y proceso
        switch (nivel.toLowerCase()) {
            case "adjunto": salario=salario+(salario*0.30);
                break;
            case "auxiliar": salario=salario+(salario*0.40);
                break;
            case "asistente": salario=salario+(salario*0.50);
                break;
            case "conserje": salario=salario+(salario*0.60);
                break;
            case "mate": salario=salario+(salario*0.50);
                break;

            default: System.out.println("Ingrese los datos correctos");
                break;
        } 

        //datos de salida
        System.out.println("Tu salario  es de $"+salario+" y tu catergoria es→"+nivel);  
    }

    public static void main(String[] args) {
        System.out.println("Hoy veremos que categoria eres y cuanto de slario recibes por ello");
        docente();

    
    }
    
}
