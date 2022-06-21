package clubDeMontaniaLaParra;

public class tablaDispersaEnlazada {
    
    static final double CONST = 0.618034;
    static final int TAMANTABLA = 97;
    private int numElementos;
    private Elemento [] tabla ; 

    static int dispersion(long x)
    {
        double t;
        int v;
        t = CONST * x - Math.floor(CONST * x); // parte decimal 
        v = (int) (TAMANTABLA * t);
        return v;
    }
    
    public tablaDispersaEnlazada() // constructor
    {
        tabla = new Elemento[TAMANTABLA];
        for (int k = 0; k < TAMANTABLA; k++)
            tabla[k] = null;
        
            numElementos = 0;
    }
    
    public void insertar(tipoSocio s)
    {
        int posicion;
        Elemento nuevo;
        posicion = dispersion(s.getCodigo());
        nuevo = new Elemento(s);
        nuevo.sgte = tabla[posicion];
        tabla[posicion] = nuevo;
        numElementos++;
    }

    //boolean conforme(tipoSocio a);
    
    public void eliminar(int codigo)
    {
        int posicion;
        posicion = dispersion(codigo);
        
        if (tabla[posicion] != null) {// no está vacía 
            
            Elemento anterior, actual;
            anterior = null;
            actual = tabla[posicion];
            
            while ((actual.sgte != null) && actual.getSocio().getCodigo() != codigo){
                anterior = actual;
                actual = actual.sgte;
            }
            
            if (actual.getSocio().getCodigo() != codigo)
                System.out.println("No se encuentra en la tabla el socio " + codigo);
                else{ //se retira el nodo
            
                    if (anterior == null){// primer nodo
                        tabla[posicion] = actual.sgte;
                    }   else{
                            anterior.sgte = actual.sgte;
                        }
                        
                    actual = null;
                    numElementos--;
                }
        }
    }
public Elemento buscar(int codigo)
{
    Elemento p = null;
    int posicion;
    posicion = dispersion(codigo);
    if (tabla[posicion] != null) 
    {
        p = tabla[posicion];
        while ((p.sgte != null) && p.socio.codigo != codigo)
            p = p.sgte;
        if (p.socio.codigo != codigo)
            p = null;
    }
    return p;
}





}
