package dbchanges.dtl;

public class ProjetoDTO {
    
    Number id;
    String nome;
    String observacao;
    String responsavel;
    String usuarioDaConexao;
    String senha;
    String host;
    Number porta;
    String sid;
    
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

    public String getUsuarioDaConexao() {
        return usuarioDaConexao;
    }

    public void setUsuarioDaConexao(String usuarioDaConexao) {
        this.usuarioDaConexao = usuarioDaConexao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Number getPorta() {
        return porta;
    }

    public void setPorta(Number porta) {
        this.porta = porta;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}