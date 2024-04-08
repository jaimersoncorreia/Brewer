package tech.bacuri.brewer.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cerveja {
    @NotBlank
    private String sku;

    private String nome;
}
