
package codigo_jogo_da_memoria;

public class Curiosidade {
    
    protected int numero;
    protected String elemento;
    protected String curiosidade;
    
    //Construtor
    public Curiosidade(int numero, String elemento,String curiosidade){
        this.numero = numero;
        this.elemento = elemento;
        this.curiosidade = curiosidade;
    }
    //Set
    public void setNumero(int numero){ this.numero = numero; }
    public void setElemento(String elemento){ this.elemento = elemento; }
    public void setCuriosidade(String curiosidade){ this.curiosidade = curiosidade; } 
    //Get
    public int getNumero(){ return numero; }
    public String getElemento(){ return elemento; }
    public String getCuriosidade(){ return curiosidade; }
    //toString
    @Override
    public String toString(){
        return getNumero()+","+getElemento()+","+getCuriosidade();
    }
}
