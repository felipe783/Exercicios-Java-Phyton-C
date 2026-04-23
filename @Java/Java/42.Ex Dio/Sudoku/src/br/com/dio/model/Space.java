package br.com.dio.model;

public class Space {

    private Integer actual;
    private final int excepted;
    private final boolean fixed;

    public Space(int excepted, boolean fixed) {
        this.excepted = excepted;
        this.fixed = fixed;
        if(fixed){
            actual = excepted;
        }
    }


    public Integer getActual() {
        return actual;
    }

    public void setActual(final Integer actual) {
        if(fixed) return;
        this.actual = actual;
    }
    public void clearSpace(){
        setActual(null);
    }
    public int getExcepted() {
        return excepted;
    }

    public boolean isFixed() {
        return fixed;
    }
}
