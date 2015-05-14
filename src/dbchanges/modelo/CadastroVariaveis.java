package dbchanges.modelo;

public class CadastroVariaveis {
    Number id;
    Number linhas;
    Number colunas;
    Number fks;
    Number constraints;
    Number indices;
    Number triggers;
    Number functions;
    Number views;
    Number tabelas;
    Number idprojeto;
            
    public Number getId(){
        return id;
    }
    
    public void setId(){
        this.id = id;
    }
    
    public Number getLinhas(){
        return linhas;
    }
    
    public void setLinhas(Number linhas){
        this.linhas = linhas;
    }
    
    public Number getColunas(){
        return colunas;
    }
    
    public void setColunas(Number colunas){
        this.colunas = colunas;
    }
    
    public Number getFks(){
        return fks;
    }
    
    public void setFks(Number fks){
        this.fks = fks;
    }
    
    public Number getConstraints(){
        return constraints;
    }
    
    public void setConstraints(Number constraints){
        this.constraints = constraints;
    }
    
    public Number getIndices(){
        return indices;
    }
    
    public void setIndices(Number indices){
        this.indices = indices;
    }
    
    public Number getTriggers(){
        return triggers;
    }
    
    public void setTriggers(Number triggers){
        this.triggers = triggers;
    }
    
        public Number getFunctions(){
        return functions;
    }
    
    public void setFunctions(Number functions){
        this.functions = functions;
    }
    
    public Number getViews(){
        return views;
    }
    
    public void setViews(Number views){
        this.views = views;
    }
    
    public Number getTabelas(){
        return tabelas;
    }
    
    public void setTabelas(Number tabelas){
        this.tabelas = tabelas;
    }
    
    public Number getIdProjeto(){
        return idprojeto;
    }
    
    public void setIdProjeto(Number idprojeto){
        this.idprojeto = idprojeto;
    }
}
