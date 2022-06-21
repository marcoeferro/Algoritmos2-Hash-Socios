public class Elemento {
    
    tipoSocio socio;
    Elemento sgte;
    
    public Elemento(tipoSocio socio)
    {
        this.socio = socio;
        this.sgte = null;
    }
    
    public tipoSocio getSocio()
    {
        return socio;
    }
    
}
