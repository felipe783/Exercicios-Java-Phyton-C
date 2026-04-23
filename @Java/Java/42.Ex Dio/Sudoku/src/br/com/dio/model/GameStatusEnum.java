package br.com.dio.model;

public enum GameStatusEnum {
    NON_STARTED("Não iniciado"),
    COMPLETE("Completo"),
    INCOMPLETE("Incompleto");

    private String label;

    GameStatusEnum(final String label){
        this.label = label;
    }

    public String getLabel(){
        return label;
    }

}
