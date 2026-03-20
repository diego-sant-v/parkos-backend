package parking.system.domain.enums;

public enum FuelEnum {
    FLEX("Flex"),
    GASOLINA("Gasolina"),
    ETANOL("Etanol"),
    DIESEL("Diesel"),
    ELETRICO("Elétrico"),
    HIBRIDO("Híbrido"),
    GNV("GNV");

    private final String descricao;

    FuelEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
