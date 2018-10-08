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
 
import java.util.Date;
 
public class Chamado implements IChamado {
    
    private Date data;
    private Cliente cliente;
    private String descricao;
    private int prioridade;
    private Tecnico tecnico;
    private TipoChamado tipoChamado;
    private String titulo;
    
 
    
    public Chamado(Date data, Cliente cliente, Tecnico tecnico, String titulo, String descricao, int prioridade, TipoChamado tipoChamado){
        this.data = data;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.tipoChamado = tipoChamado;
    }
    
    @Override
    public Cliente getCliente(){	 	  	  		      	     	      			       	 	
        return this.cliente;
    }

    @Override
    public String getDescricao(){
        return this.descricao;
    }

    @Override
    public int getPrioridade(){
        return this.prioridade;
    }

    @Override
    public Tecnico getTecnico(){
        return this.tecnico;
    }

    @Override
    public TipoChamado getTipo(){
        return this.tipoChamado;
    }

    @Override
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public void setPrioridade(int prioridade){
        this.prioridade = prioridade;
    }	 	  	  		      	     	      			       	 	
    public void setTecnico(Tecnico tecnico){
        this.tecnico = tecnico;
    }
    public void setTipoChamado(TipoChamado tipoChamado){
        this.tipoChamado = tipoChamado;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
}