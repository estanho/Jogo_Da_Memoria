
package codigo_jogo_da_memoria;

public class Carta {
    
    protected Integer numero;
    protected String elemento;
    
    //Construtor
    
    public Carta(Integer numero, String elemento){
        this.numero = numero;
        this.elemento = elemento;
    }
    
    //Set    
    public void setNumero(Integer numero){ this.numero = numero; }
    public void setElemento(String elemento){ this.elemento = elemento; }
    
    //Get
    public Integer getNumero(){ return numero; }
    public String getElemento(){ return elemento; }
}
