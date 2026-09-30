
import java.util.Scanner;

//CREAR UN PROGRAMA QUE DETERMINE EL SALARIO FINAL DE UN TRABAJADOR 
//SI ES PROGRAMADOR SE AGREGA UN 25% AL SALARIO FINAL
//SI ES MEDICO SE AGREGA UN 100% AL SALARIO TOTAL 
//SI ES ADMINISTRATIVO SE AGREGA 2$ AL SALARIO FINAL
//SI TIENE UNA MULTA SE DESCUENTA 15% AL SALARIO FINAL4
//EL PROGRAMA DEBE RECIBIR EL NOMBRE Y EL SALARIO DEL TRABAJADOR

public class main {

    public static void main (String[]args){
        
        String nombre;
        double salario;
        int opcion;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("############################");
        System.out.println("1.Es Programador");
        System.out.println("2.Es medico");
        System.out.println("3.Es Administrador \n");

        System.out.println("Ingresa una opcion");
        opcion = entrada.nextInt();
        
        switch(opcion) {
            case 1:

            case 2:

            case 3:

        }
        

}
}