package dbchanges.dtl;

public class VariaveisDTO {
    Integer id;
    Integer linhas;
    Integer colunas;
    Integer fks;
    Integer constraints;
    Integer indices;
    Integer triggers;
    Integer functions;
    Integer views;
    Integer tabelas;
    Integer idProjeto;
    Float tempoEstimado;

    public Float getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(Float tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLinhas() {
        return linhas;
    }

    public void setLinhas(Integer linhas) {
        this.linhas = linhas;
    }

    public Integer getColunas() {
        return colunas;
    }

    public void setColunas(Integer colunas) {
        this.colunas = colunas;
    }

    public Integer getFks() {
        return fks;
    }

    public void setFks(Integer fks) {
        this.fks = fks;
    }

    public Integer getConstraints() {
        return constraints;
    }

    public void setConstraints(Integer constraints) {
        this.constraints = constraints;
    }

    public Integer getIndices() {
        return indices;
    }

    public void setIndices(Integer indices) {
        this.indices = indices;
    }

    public Integer getTriggers() {
        return triggers;
    }

    public void setTriggers(Integer triggers) {
        this.triggers = triggers;
    }

    public Integer getFunctions() {
        return functions;
    }

    public void setFunctions(Integer functions) {
        this.functions = functions;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getTabelas() {
        return tabelas;
    }

    public void setTabelas(Integer tabelas) {
        this.tabelas = tabelas;
    }

    public Integer getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(Integer idProjeto) {
        this.idProjeto = idProjeto;
    }
            
}
