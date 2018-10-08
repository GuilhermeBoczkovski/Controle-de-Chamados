/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

/**
 *
 * @author Jean Hauck <jean.hauck at ufsc.br>
 * @date 11/04/2016
 */
public class TipoChamado implements ITipoChamado {
    
    private int codigo;
    private String nome;
    private String descricao;
    
    public TipoChamado(){
    }
    
    public TipoChamado(int codigo, String nome, String descricao){
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }
    
    @Override
    public int getCodigo(){
        return this.codigo;
    }

    @Override
    public String getDescricao(){
        return this.descricao;
    }

    @Override
    public String getNome(){	 	  	  		      	     	      			       	 	
        return this.nome;
    }
    
}