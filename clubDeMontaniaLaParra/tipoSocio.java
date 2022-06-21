import java.io.*;
import java.util.Scanner;
public class tipoSocio
{
    class Fecha
    {
        int dia;
        int mes;
        int anno;
        Fecha ()
        {
            asigna();
        }
        
        public void asigna() {
            
            Scanner entrada = new Scanner(System.in);
            
            System.out.print(" Ingrese el dia \n");
            int dia =  entrada.nextInt();
            entrada.nextLine();
            System.out.print(" Ingrese el mes \n");
            int mes =  entrada.nextInt();
            entrada.nextLine();
            System.out.print(" Ingrese el año \n");
            int anno = entrada.nextInt();
            entrada.nextLine(); 
            
            entrada.close();
            
            this.dia = dia;
            this.mes = mes;
            this.anno = anno;
            
        }
        public String toString()
        {
            return " " + dia + "-" + mes + "-" + anno;
        }
    };
    
    //Atributos de clase
    public int codigo;
    public String nombre;
    public int edad;
    public Fecha fecha;
    
    public tipoSocio()
    {
        asigna ();
    }

    public void asigna (){
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("\n Numero de Socio: ");
            this.codigo = Integer.parseInt(entrada.readLine());
            System.out.print("\n Nombre: ");
            this.nombre = entrada.readLine(); 
            System.out.print("\n Edad: ");
            this.edad = Integer.parseInt(entrada.readLine()); 
            this.fecha = new Fecha();
        }
        catch (IOException e)
        {
            System.out.println(" Excepcion en la entrada de datos " + e.getMessage()+ " . No se da de alta");
        }
        
    }
    
    public int getCodigo()
    {
        return codigo;
    }
    //muestra por pantalla los atributos de la clase 
    public void muestra()
    {
        System.out.println("\n Numero de Socio " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Fecha: " + fecha);
    }
};