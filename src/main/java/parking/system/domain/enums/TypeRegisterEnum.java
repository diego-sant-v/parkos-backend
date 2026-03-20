package parking.system.domain.enums;

public enum TypeRegisterEnum {
    AVULSO("Avulso"),
    MENSALISTA("Mensalista"),
    PERMANENTE("Permanente");

    private final String descricao;

    TypeRegisterEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
