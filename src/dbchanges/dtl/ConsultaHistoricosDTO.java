package dbchanges.dtl;

public class ConsultaHistoricosDTO {
    private int id;
    private String projeto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjeto(){
        return projeto;
    }
    
    public void setProjeto(String projeto){
        this.projeto = projeto;
    }
    
    @Override public String toString() {  
        return getProjeto();      
    }  
}
