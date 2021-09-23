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
public class Jogador {
    protected String nome;
    protected Integer pontos;
    protected Integer rodadas;
    protected String dificuldade;
    
    //Construtor
    public Jogador(String nome,Integer pontos,Integer rodadas,String dificuldade){
        this.nome = nome;
        this.pontos = pontos;
        this.rodadas = rodadas;
        this.dificuldade = dificuldade;
    }
    //Set
    public void setNome(String nome){ this.nome = nome; }
    public void setPontos(Integer pontos){ this.pontos = pontos; }
    public void setRodadas(Integer rodadas){ this.rodadas = rodadas; }
    public void setDificuldade(String dificuldade){ this.dificuldade = dificuldade; } 
    //Get
    public String getNome(){ return nome; }
    public Integer getPontos(){ return pontos; }
    public Integer getRodadas(){ return rodadas; }
    public String getDificuldade(){ return dificuldade; }
    //toString
    @Override
    public String toString(){
        return getNome()+","+getPontos()+","+getRodadas()+","+getDificuldade();
    }
}
