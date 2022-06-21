package clubDeMontaniaLaParra;
import java.util.Scanner;

public class App {
    
    private static Scanner input = new Scanner(System.in);
    private static int rta=0,condicion=99;
    private static int clave;
    private static tablaDispersaEnlazada tablaHash = new tablaDispersaEnlazada();
    
    public static void main(String[] args){
             
        do{
            System.out.print("[1] Insertar una Socio \n");
            System.out.print("[2] Eliminar una Socio \n");
            System.out.print("[3] Buscar una Elemento \n");
            System.out.print("[0] Salir del programa \n");
            rta=input.nextInt();
            input.nextLine();
            
            switch(rta){
                case 1:
                    tipoSocio socio = new tipoSocio();
                    tablaHash.insertar(socio);
                    break;
                case 2:
                    System.out.print("Ingrese Numero del Socio que desea Eliminar \n");
                    clave=input.nextInt();
                    input.nextLine();
                    tablaHash.eliminar(clave);
                    break;
                case 3:
                    tipoSocio socioMostrar = new tipoSocio();
                    System.out.print("Ingrese el Numero del Socio que desea Buscar \n");
                    clave=input.nextInt();
                    input.nextLine();
                    socioMostrar = tablaHash.buscar(clave).getSocio();
                    socioMostrar.muestra();
                    break;
                case 0 :
                    condicion = 0;
                    break;
                default:
                    System.out.print("La opcion ingresada no es valida\n");
                    break;

            }

        }while(condicion!= 0);
        System.out.print("Ejecucion Terminada \n");

    }



    
}
