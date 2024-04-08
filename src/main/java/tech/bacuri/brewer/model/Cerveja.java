package tech.bacuri.brewer.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cerveja {
    @NotBlank
    private String sku;

    @NotBlank
    private String nome;

    @Size(min = 1, max = 50)
    private String descricao;
}
