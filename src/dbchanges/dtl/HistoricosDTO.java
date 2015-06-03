package dbchanges.dtl;

public class HistoricosDTO {

    private int linhas;
    private int colunas;
    private int tempoEstimado;
    private int fks;
    private int constraints2;
    private int index2;
    private int trigger2;
    private int function2;
    private int view2;
    private int tabela;
    private int tempoReal;
    
    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }
    
    public int getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(int tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }
    
    public int getFks() {
        return fks;
    }

    public void setFks(int fks) {
        this.fks = fks;
    }

    public int getConstraints2() {
        return constraints2;
    }

    public void setConstraints2(int constraints2) {
        this.constraints2 = constraints2;
    }

    public int getIndex2() {
        return index2;
    }

    public void setIndex2(int index2) {
        this.index2 = index2;
    }

    public int getTrigger2() {
        return trigger2;
    }

    public void setTrigger2(int trigger2) {
        this.trigger2 = trigger2;
    }

    public int getFunction2() {
        return function2;
    }

    public void setFunction2(int function2) {
        this.function2 = function2;
    }

    public int getView2() {
        return view2;
    }

    public void setView2(int view2) {
        this.view2 = view2;
    }

    public int getTabela() {
        return tabela;
    }

    public void setTabela(int tabela) {
        this.tabela = tabela;
    }

    public int getTempoReal() {
        return tempoReal;
    }

    public void setTempoReal(int tempoReal) {
        this.tempoReal = tempoReal;
    }

}