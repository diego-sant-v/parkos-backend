package parking.system.domain.enums;

public enum CategoryEnum {
    PASSEIO("Passeio"),
    MOTO("Moto"),
    CAMINHONETE("Caminhonete"),
    UTILITARIO("Utilitário"),
    SUV("SUV"),
    VAN("Van"),
    ONIBUS("Ônibus"),
    CAMINHAO("Caminhão"),
    PCD("PCD");

    private final String descricao;

    CategoryEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}