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
    protected Integer id;
    protected String nome;
    protected String curiosidade;
    
    //Construtor
    public Curiosidade(Integer id,String nome,String curiosidade){
        this.id = id;
        this.nome = nome;
        this.curiosidade = curiosidade;
    }
    //Set
    public void setId(Integer id){ this.id = id; }
    public void setNome(String nome){ this.nome = nome; }
    public void setCuriosidade(String curiosidade){ this.curiosidade = curiosidade; } 
    //Get
    public Integer getId(){ return id; }
    public String getNome(){ return nome; }
    public String getCuriosidade(){ return curiosidade; }
    //toString
    @Override
    public String toString(){
        return getId()+","+getNome()+","+getCuriosidade();
    }
}
