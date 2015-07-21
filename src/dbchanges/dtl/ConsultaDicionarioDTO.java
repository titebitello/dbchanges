package dbchanges.dtl;

public class ConsultaDicionarioDTO {

    Integer linhas;
    Integer colunas;
    Integer fks;
    Integer constraints;
    Integer indices;
    Integer triggers;
    Integer functions;
    Integer views;

    public Integer getLinhas() {
        return linhas;
    }

    public void setLinhas(Integer linhas) {
        this.linhas = linhas;
    }

    public Integer getIndices() {
        return indices;
    }

    public void setIndices(Integer indices) {
        this.indices = indices;
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
}
