// GenTextual.java
public abstract class GenTextual {
    private String exemplo;
    private String desc;

    public String getExemplo() {
        return exemplo;
    }

    public String getDesc() {
        return desc;
    }
    
    public GenTextual(String nome, String desc){
        this.exemplo = exemplo;
        this.desc = desc;
    }
    
    
    public abstract void explicarGenero();
}