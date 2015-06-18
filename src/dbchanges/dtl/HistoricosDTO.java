package dbchanges.dtl;

import java.util.Date;

public class HistoricosDTO {

    Integer linhas;
    Integer colunas;
    Integer fks;
    Integer constraints2;
    Integer index2;
    Integer trigger2;
    Integer function2;
    Integer view2;
    Integer tabela;
    Integer tempoReal;
    Integer tempoEstimado;
    Integer id;
    String status;
    Date datahora;
    
    
    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(Integer linhas) {
        this.linhas = linhas;
    }
    
    public int getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(Integer tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(Integer colunas) {
        this.colunas = colunas;
    }
    
    public int getFks() {
        return fks;
    }

    public void setFks(Integer fks) {
        this.fks = fks;
    }

    public int getConstraints2() {
        return constraints2;
    }

    public void setConstraints2(Integer constraints2) {
        this.constraints2 = constraints2;
    }

    public int getIndex2() {
        return index2;
    }

    public void setIndex2(Integer index2) {
        this.index2 = index2;
    }

    public int getTrigger2() {
        return trigger2;
    }

    public void setTrigger2(Integer trigger2) {
        this.trigger2 = trigger2;
    }

    public int getFunction2() {
        return function2;
    }

    public void setFunction2(Integer function2) {
        this.function2 = function2;
    }

    public int getView2() {
        return view2;
    }

    public void setView2(Integer view2) {
        this.view2 = view2;
    }

    public int getTabela() {
        return tabela;
    }

    public void setTabela(Integer tabela) {
        this.tabela = tabela;
    }

    public int getTempoReal() {
        return tempoReal;
    }

    public void setTempoReal(Integer tempoReal) {
        this.tempoReal = tempoReal;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDatahora() {
        return datahora;
    }

    public void setDatahora(Date datahora) {
        this.datahora = datahora;
    }
}