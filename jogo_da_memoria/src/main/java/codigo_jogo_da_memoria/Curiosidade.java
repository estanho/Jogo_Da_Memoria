/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo_jogo_da_memoria;

/**
 *
 * @author pedro
 */
public class Curiosidade {
    protected String nome;
    protected String curiosidade;
    
    //Construtor
    public Curiosidade(String nome,String curiosidade){
        this.nome = nome;
        this.curiosidade = curiosidade;
    }
    //Set
    public void setNome(String nome){ this.nome = nome; }
    public void setCuriosidade(String curiosidade){ this.curiosidade = curiosidade; } 
    //Get
    public String getNome(){ return nome; }
    public String getCuriosidade(){ return curiosidade; }
    //toString
    @Override
    public String toString(){
        return getNome()+","+getCuriosidade();
    }
}
