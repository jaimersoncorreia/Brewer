package tech.bacuri.brewer.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cerveja {
    @NotBlank(message = "Sku é um campo obrigatório")
    private String sku;

    @NotBlank(message = "Nome é um campo obrigatório")
    private String nome;

    @Size(min = 1, max = 50, message = "Deve ter entre {min} e {max} caracteres.")
    private String descricao;
}
