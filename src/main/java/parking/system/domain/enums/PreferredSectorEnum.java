package parking.system.domain.enums;

public enum PreferredSectorEnum {
    QUALQUER("Qualquer disponível"),
    SETOR_A("Setor A"),
    SETOR_B("Setor B"),
    SETOR_C("Setor C"),
    COBERTO("Coberto"),
    TERREO("Térreo");

    private final String descricao;

    PreferredSectorEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
