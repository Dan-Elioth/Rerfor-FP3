import java.util.Scanner;

public class RepasoESTCondicional {

    static Scanner teclado=new Scanner(System.in);
    
    public static void Ejercicio1() {

        //variables
        int temperatura=0;
        int clima;
        //datos de entrada y proceso
        System.out.println("A cuanto esta la temperatura:");
        temperatura=teclado.nextInt();
        System.out.println("Como esta el clima por ahi:\nhace Sol=1\nesta lluviendo=2\nhace Frio=3");
        clima=teclado.nextInt();
        if(temperatura>25){
            System.out.println("HEy joven que haces en casa... Corre a la playa mi king!!!");
        }else{
            System.out.println("manito mejor quedate en tu casa y abrigate");
        }
        if(clima==1){
            System.out.println("LLevate un sombrilla, o si no te vas a quemar");
    
        if(clima==2){
            System.out.println("No salgas que te vas a mojar");

        if(clima==3){
            System.out.println("te vas a resfriar, abrigate");
                }
            }
        }
        
    }
    public static void main(String[] args) {
        Ejercicio1();
        
    }
}
