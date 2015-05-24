package dbchanges.dtl;

public class ProjetoDTO {
    
    Number id;
    String nome;
    String observacao;
    String responsavel;
    
    public Number getId(){
        return id;
    }
    
    public void setId(){
        this.id = id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getObservacao(){
        return observacao;
    }
    
    public void setObservacao(String observacao){
        this.observacao = observacao;
    }
    
    public String getResponsavel(){
        return responsavel;
    }
    
    public void setResponsavel(String responsavel){
        this.responsavel = responsavel;
    }
}